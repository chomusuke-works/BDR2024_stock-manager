UPDATE etagere SET nom = ?, eststock = ? WHERE id = ?;
SELECT produit.nom, sum(lot.quantite), etagere.nom, produit.code, etagere.id FROM produit_etagere RIGHT JOIN produit ON produit_etagere.codeproduit = produit.code LEFT JOIN etagere ON produit_etagere.idetagere = etagere.id LEFT JOIN lot ON produit.code = lot.codeproduit GROUP BY produit.nom, etagere.nom, produit.code, etagere.id;