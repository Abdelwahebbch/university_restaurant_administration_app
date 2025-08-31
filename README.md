# WahatApp-Administration

Un logiciel moderne développée en java pour numériser le trafic d'un restaurant universitaire pour les étudiants tunisiens.

## 📱 Aperçu

WahatApp-Administration permet aux Administration de gérer facilement les carte restaurant universitaire . Le logiciel offre la consultation du profile des etudiants, la recharge de cartes ,identifier des nouveaux etudiants.

## 📋 Fonctionnalités principales

- 📁 **Gestion des cartes d'étudiants** (ajout, modification, suppression, recharge)
- 🔐 Intégration prévue de rôles administrateur / Employer

## 🧱 Architecture

- **JavaFX** — Interface utilisateur
- **Oracle Database (ojdbc)** — Stockage des patients et ordonnances
- **Maven** — Gestion de projet et des dépendances
- **MVC** — Architecture logique : `Controller`, `DAO`, `Model`, `Util`

## 📦 Dépendances

```xml
    <dependencies>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>17.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>17.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics</artifactId>
            <version>17.0.2</version>
        </dependency>

        <dependency>
            <groupId>com.jfoenix</groupId>
            <artifactId>jfoenix</artifactId>
            <version>9.0.10</version>
        </dependency>
    </dependencies>
```

## 🚀 Installation


1. **Cloner le repo :**

```bash
git clone https://github.com/Abdelwahebbch/Pharmacy-App.git
cd pharmacy-app
```

2. **Configurer la base Oracle :**
   - Créer les tables nécessaires :
     ```sql
     CREATE TABLE Students (...);
     CREATE TABLE Teachers (...);
     CREATE TABLE sales (...);
     ```
   - Créer les séquences nécessaires :
     ```sql
     create sequence stdnt_seq start with 1 increment by 1 nocache nocycle;
     ```
   - Modifier les informations de connexion dans `DataBaseConnection.java`

3. **Compiler et exécuter :**
   ```bash
   mvn clean javafx:run
   ```

> 📌 Assure-toi que JavaFX est bien installé et que ton IDE le reconnaît comme module.

---


## 📱 Captures d'écran

| Login Screen | Home Screen | Profile Screen |
|----------------|----------|------------|
| ![Login](images/login.png) | ![Home](images/home.png) | ![Profile](images/profile.png) |

## 🏗️ Structure du Projet

```
wahatapp/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── wahat/
│       │           ├── controller/
│       │           │   ├── DashboardController.java
│       │           │   ├── NewStudentController.java
│       │           │   ├── PrimaryStageController.java
│       │           │   ├── SettingsController.java
│       │           │   ├── StudentListController.java
│       │           │   └── UserManagementController.java
│       │           │
│       │           ├── DAO/
│       │           │   └── (your DAO classes here)
│       │           │
│       │           ├── model/
│       │           │   └── StudentModel.java
│       │           │
│       │           ├── util/
│       │           │   ├── DataBaseConnection.java
│       │           │   └── SceneSwitcher.java
│       │           │
│       │           ├── Validation/
│       │           │   └── (validation helpers here)
│       │           │
│       │           ├── Main.java
│       │           └── module-info.java
│       │
│       └── resources/
│           ├── css/
│           │   ├── register-styles.css
│           │   ├── styles.css
│           │   └── stylesX.css
│           │
│           └── fxml/
                  │
                  ├── Affichage/
                  │   ├── Dashboard.fxml
                  │   ├── Settings.fxml
                  │   └── StudentsListScene.fxml
                  │
                  ├── Login/
                  │   ├── LoginScene.fxml
                  │   └── register.fxml
                  │
                  ├── Modification/
                  │   ├── AddStudentScene.fxml
                  │   └── SalesScene.fxml
                  │
                  ├── Not-Used/
                  │   └── UserManagement.fxml
                  │
                  └── PrimaryStage.fxml


          

```

## 💰 Système de Paiement

- **Prix fixe** : 200 millimes par ticket
- **Options de recharge** : un nombre personnalisé de tickets 




## 🤝 Contribution

Les contributions sont les bienvenues ! Veuillez suivre ces étapes :

1. Fork le projet
2. Créez une branche pour votre fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Committez vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Push vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request
   
## 📄 Licence

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails.
## 👥 Équipe

- **Développeur Principal** : [Abdelwaheb Bouchahwa](https://github.com/Abdelwahebbch)
<!-- - **Designer UI/UX** : [Nom Designer](https://github.com/designer-username)-->

## 📞 Support

Pour toute question ou problème :

- 📧 Email : bouchahwaabdelwaheb@ieee.org

<!--
## 🙏 Remerciements

- Université de Gabes pour le partenariat
- Communauté Flutter pour les ressources
- Étudiants testeurs pour leurs retours
-->
---

**WahatApp-Administration** - Simplifier la vie étudiante ! 🎓✨
