# https://paie-apii.herokuapp.com/entreprises

---

## Web Api pour "Ajouter un employe"

- Un champs "matricule" : Rentré à la main


- un champs "entreprise" : GET/entreprises

- un champs "profil" : GET/profils


- un champs "grade" : GET/grades

- un GET/referentiels qui regroupe les trois données la page "Ajouter un employé"


- un bouton "ajouter" : POST/remuneration_employe

---

ContentType: application/json

{

    "matricule": XXXXX
    "entreprise": Entreprise X
    "profil": Cadre/Stagière/Technicien
    "Grade": A/B/C
}

---

Réponse en cas de succès

**200**

Content-Type: application/json

{

	"message": "Le ressource a été créée"
}

---

Réponse en cas d'erreur (matricule non trouvé)

**404**

Content-Type: application/json

{

	"message": "Le matricule ne correspond à aucun employé"
}

---

Réponse en cas d'erreur (Entreprise non sélectionnée)

**404**

Content-Type: application/json

{

	"message": "Aucune entreprise sélectionnée"
}

---

Réponse en cas d'erreur (Profil non sélectionné)

**404**

Content-Type: application/json

{

	"message": "Aucun profil sélectionné"
}

---

Réponse en cas d'erreur (Grade non séectionné)

**404**

Content-Type: application/json

{

	"message": "Aucun grade sélectionné"
}

---








