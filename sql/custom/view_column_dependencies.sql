SELECT view_class.relnamespace::regnamespace  AS view_schema
     , view_class.relname                     AS view_name
     , table_class.relnamespace::regnamespace AS table_schema
     , table_class.relname                    AS table_name
     , table_a.attname                        AS column_name
FROM pg_class table_class
         JOIN pg_attribute table_a ON table_a.attrelid = table_class.oid
         JOIN pg_depend dep ON dep.refobjid = table_a.attrelid AND dep.refobjsubid = table_a.attnum
         JOIN pg_rewrite rewrite ON rewrite.oid = dep.objid
         JOIN pg_class view_class ON view_class.oid = rewrite.ev_class
    AND dep.classid = 'pg_rewrite'::regclass -- it's a view
    AND rewrite.ev_type = '1' -- only SELECT
    AND rewrite.is_instead -- INSTEAD rule
    AND view_class.relname = coalesce(:view_name, view_class.relname)

