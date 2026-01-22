Book Management Backend (Spring Boot)

 This is the backend service for the Book Management Application, built using Spring Boot and MongoDB.
 It provides RESTful APIs for managing books and can automatically fetch book details from the Google Books API using ISBN.

Tech Stack
 1.Java 17
 2.Spring Boot
 3.Spring Web
 4.MongoDB
 5.Maven
 6.Google Books API
 7.Railway (Deployment)
 8.Cloudinary (Optional – image storage)

Features
1.Add, View, Delete Books
2.Fetch book details using ISBN from Google Books API
3.RESTful API architecture
4.MongoDB integration
5.CORS configuration for frontend access
6.Environment-based configuration (production ready)

Project Structur
src/main/java
└── Valoriz.BookManagement
    ├── controller      # REST controllers
    ├── service         # Business logic 
    ├── repository      # MongoDB repositories
    ├── model           # Data models
    └── config          # Cor and App Config

API Refference
 GET	/api/books        # Get all books
 GET	/api/books/{id}	  # Get book by ID
 POST	/api/books	      # Add a new book
 DELETE	/api/books/{id}	# Delete a book

Example Response
 {
   "id": B-01,
   "title": "Atomic Habits",
   "author": "James Clear",
   "isbn": "9780735211292",
   "genre": "Self Help",
   "rating": 4,
   "imgUrl:"uploadedimage.com"
 }


Environment Variables
 #MongoDB
 MONGO_DB_NAME=your_db_name
 MONGO_URI=your_mongo_uri
 #Frontend URL
 FRONTEND_URL=https://your-frontend-url
 #Google API 
 GOOGLE_API=your_google_books_api
 #Cloudinary
 CLOUDINARY_CLOUD_NAME=your_cloud_name
 CLOUDINARY_API_KEY=your_api_key
 CLOUDINARY_API_SECRET=your_api_secret

Running Locally
 git clone https://github.com/your-username/book-management-backend.git
 cd book-management-backend
 mvn spring-boot:run




    
