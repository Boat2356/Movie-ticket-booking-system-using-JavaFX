# Movie-ticket-booking-system-using-JavaFX
## The origin and significance
Online movie ticket bookings are one of the most popular channels to buy tickets today. Users can book tickets through the website without losing time in the queues. Therefore, the development of an easy-to-use and fast-paced online movie ticket booking system is very important for users.

This project is designed to allow users to book seats, choose the type of movie tickets, and view bookings, using JavaFx in conjunction with the Scene Builder to develop a system that has a beautiful and easy-to-use display on the screen.

## Objective
- To design the GUI of the movie ticket booking system using JavaFx in conjunction with the Scene Builder 

## The scope of the project
Developed an online movie ticket booking system with JavaFx in conjunction with Scene Builder, which works as follows
- Adding/deleting/modifying the movie and adjusting the movie status.
- Ticket purchasing system, which allows you to choose the type of ticket, the number of tickets you want.
- There's a system showing the revenue from the ticket sales and the number of movies being screened.

## Workflow
1. GUI (Graphic User Interface) Design using Scene Builder.
- Designing the Dashboard page with three labels: 1. Total ticket sales, 2. Total revenue, and 3. Number of movies currently showing.
  
<p align="center">
  <img width="650" height="456" src="https://github.com/Boat2356/Movie-ticket-booking-system-using-JavaFX/assets/140761543/7ba5dc2b-7440-41eb-bda6-d3de405a60d0">
</p>

- Designing the Add Movies page with fields for movie name, category, duration, release date, and buttons for adding, deleting, and updating movies. Data will be displayed in a table format.

<p align="center">
  <img width="650" height="456" src="https://github.com/Boat2356/Movie-ticket-booking-system-using-JavaFX/assets/140761543/815571ac-d18d-400e-af9b-c81cc135940b">
</p>
  
- Designing the Available Movies page with options to select a movie, ticket type, and desired seat. It will also include a history window displaying purchased items.

<p align="center">
  <img width="650" height="456" src="https://github.com/Boat2356/Movie-ticket-booking-system-using-JavaFX/assets/140761543/fb0012f4-f1df-4848-9d6c-442db430ac47">
</p>

<p align="center">
  <img width="650" height="456" src="https://github.com/Boat2356/Movie-ticket-booking-system-using-JavaFX/assets/140761543/e4e0fa09-9799-4edd-a1db-bdb8b7cefb6b">
</p>

- Designing the Edit Screening page where movies can be updated to show if they have ended or are currently screening.

<p align="center">
  <img width="650" height="456" src="https://github.com/Boat2356/Movie-ticket-booking-system-using-JavaFX/assets/140761543/5a66d37a-be06-46d8-9c3e-97810bcebd79">
</p>

- Designing the Customer page to display seat number, movie name, ticket type, and purchase date (day and month), and allow users to delete data.
  
<p align="center">
  <img width="650" height="456" src="https://github.com/Boat2356/Movie-ticket-booking-system-using-JavaFX/assets/140761543/845412a8-d6c3-4e59-bdd2-6468bf80411a">
</p>

2. Write a program using JavaFx and connect it to the Scene Builder GUI.
- Write a program that allows navigation between different pages by clicking buttons.
- In the Add movies page, create a class called MovieData to add and display movie data in a table.
- In the Available movies page, fetch movie data from the Add movies page and create functions for selecting movies, ticket types, and seats. Design the purchase history page to display the results after clicking the purchase button.
- In the Edit Screening page, fetch data from Add movies and create a ComboBox to update whether a movie is finished or currently screening.
- In the Customer page, fetch data from purchase history and display it in a table. Create a delete button to allow users to delete selected data.
- Connect the total ticket sales, total revenue, and number of movies currently screening data to the dashboard page. The data should be based on user purchases.

## Conclusion
This project has successfully designed a movie ticket booking system using JavaFx and Scene Builder, resulting in the following summaries from the design
- The GUI for the Add Movies page allows the addition of new movie data.
- The GUI for the Available Movies page enables users to view a list of currently screening movies and reserve movie tickets.
- The GUI for the Edit Screening page enables the modification of movie screening status.
- The GUI for the Customer page displays the purchase history of customers.
- The GUI for the Dashboard page shows revenue from ticket sales, total ticket sales, and the number of movies screened.

## Recommendation
- This project should add a database system to avoid data conflicts. Make the data the same standard, which helps reduce redundancy in data storage.
