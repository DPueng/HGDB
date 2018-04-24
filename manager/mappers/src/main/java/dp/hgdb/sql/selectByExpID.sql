SELECT
    protein_level.Accession,
    protein_level.Ratio AS Ratio,
    COUNT(peptide_level.Peptide_id) AS PN
FROM
    peptide_level,
    protein_level
WHERE
    peptide_level.Exp_id = 1
        AND protein_level.Protein_id = peptide_level.Protein_id
GROUP BY peptide_level.Protein_id