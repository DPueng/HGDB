SELECT
    protein_annotation.Accession AS proteinID,
    protein_annotation.gene_symbol AS Symbol,
    protein_annotation.Description AS Description,
    protein_annotation.Molecular_weight AS MW
FROM
    protein_annotation
