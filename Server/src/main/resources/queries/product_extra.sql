SELECT nom, lot.dateexpiration, quantite FROM lot JOIN produit ON lot.codeproduit = produit.code WHERE lot.dateexpiration - current_date BETWEEN 0 AND ?;
SELECT nom, lot.dateexpiration, quantite FROM lot JOIN produit ON lot.codeproduit = produit.code WHERE lot.dateexpiration - current_date < 0;
