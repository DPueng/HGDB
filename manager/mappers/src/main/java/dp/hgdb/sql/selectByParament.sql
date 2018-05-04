SELECT 
    protein_level.Accession as Accession,
    protein_annotation.gene_symbol AS gene_symbol,
    protein_annotation.Description AS Description,
    protein_annotation.Molecular_weight AS Molecular_weight
--     ,
--     1.000000 AS FC1,
--     MAX(IF(protein_level.Exp_id = 1,
--         protein_level.Ratio,
--         0)) AS Ratio1,
--     PN_table.peptide_num1,
--     MAX(IF(protein_level.Exp_id = 1,
--         protein_level.Ratio,
--         0)) / MAX(IF(protein_level.Exp_id = 2,
--         protein_level.Ratio,
--         0)) AS FC2,
--     MAX(IF(protein_level.Exp_id = 2,
--         protein_level.Ratio,
--         0)) AS Ratio2,
--     PN_table.peptide_num1
FROM
    protein_annotation,
    protein_level,
    peptide_level
    -- ,
--     (SELECT 
--         join_table.Accession,
--             MAX(IF(join_table.Exp_id = 1, peptide_num, 0)) peptide_num1,
--             MAX(IF(join_table.Exp_id = 2, peptide_num, 0)) peptide_num2,
--             MAX(IF(join_table.Exp_id = 3, peptide_num, 0)) peptide_num3,
--             MAX(IF(join_table.Exp_id = 4, peptide_num, 0)) peptide_num4,
--             MAX(IF(join_table.Exp_id = 5, peptide_num, 0)) peptide_num5
--     FROM
--         (SELECT 
--         protein_level.Exp_id,
--             protein_level.Accession,
--             COUNT(Peptide_id) peptide_num
--     FROM
--         protein_level
--         left join peptide_level
--     on
--         protein_level.Protein_id = peptide_level.Protein_id
--     GROUP BY protein_level.Protein_id) AS join_table
--     GROUP BY join_table.Accession) AS PN_table
WHERE
    protein_annotation.Accession = protein_level.Accession
        -- AND PN_table.Accession = protein_level.Accession-- 
GROUP BY protein_level.Accession
-- ORDER BY FC2 ASC-- 

