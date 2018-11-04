MUKNU
=====

### 2018 Spring KNU COMP217004 Java Programming Class Term Project
 
## Background
     We face many choices everyday.
    The most important and awkward choice we face everyday is "Which Restaurant we should go??"
    That's why MUKNU has been made.

* * *
## STACK
 JAVA, JavaFX, HTML5, Javascript

## Installation
This program is not fully functioning for now.</br>
It is not workinng single `.exe` file. Thus, in order to execute this program, you `eclipse` IDE is reqired.

  * JavaFx Installation</br>
      `Help` - `eclipse Marketplace` - `JAVAFX` searching</br>
      install `e(fx)eclipse`
      
  * JDK Update</br>
      Latest `JDK` required
  
  * Text Encoding Setting</br>
        `UTF-8` is required In order to show Korean on this application.
        `Window` - `Preference` - `General` - `Workspace` - `Text file encoding` - set `UTF-8`

## Structure
    - model
      - restaurant.js // JSON type data file of Restaurants
    - view
      - Category.fxml // Category page frontend file
      - CategoryController.java // Cateogory page backend java file
      - ControlledScreen.java // Screen interface file
      - Korean.fxml // Category page frontend file
      - Main.fxml // Main page frontend file
      - Main.java // Main file
      - Random.fxml // Random Pick page frontend file
      - RandomController.java // Random Pick page backend java file
      - Restaurnat.fxml // Restaurant List page frontend file
      - Restaurant.java // Restaurant List page backend file
      - RestaurantList.java // Restaurant List form file
      - ScreensController.java // Screens loading file
      - application.css // CSS style file
      - map.html // Google Map Api file

## Functions
   * Random Recommendation</br>
    Randomly pick a restaurant near KNU by single click of button
    
   * Categorize Restaurants</br>
    Showing restaurant near KNU by category in order to aid resasonable and easy choice.
