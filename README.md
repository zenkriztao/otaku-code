 OtakuCode - Kotlin Anime Portfolio

**OtakuCode** is a sophisticated Kotlin-based application designed to provide an immersive and efficient platform for anime enthusiasts and developers alike. This portfolio showcases my ability to integrate modern Kotlin features, create clean architecture, and design user-centric interfaces. With a focus on anime content, this project utilizes Kotlin's power to manage complex data, deliver smooth animations, and provide an engaging user experience.

**GitHub Username**: [zenkriztao](https://github.com/zenkriztao)

## Features

* **Anime Database Integration**: Seamlessly fetch, display, and filter anime data from popular anime APIs such as [Jikan API](https://jikan.moe/), showcasing a large variety of anime content including descriptions, ratings, and cover images.
* **Search and Filter Functionality**: Advanced searching and filtering options that allow users to search by genre, popularity, rating, and more, ensuring a tailored anime discovery experience.
* **Smooth UI/UX**: Responsive and interactive user interface built with Jetpack Compose for a modern, declarative UI, ensuring smooth animations and transitions that mirror the dynamic nature of anime.
* **Manga Reader Integration**: Display manga chapters and volumes associated with specific anime, giving users an immersive reading experience directly from the app.
* **User Favorites and Lists**: Enable users to save their favorite anime and manga for quick access, creating personalized watchlists and recommendations.
* **Offline Mode**: Cache anime and manga data for offline viewing, ensuring that users can enjoy content even when disconnected from the internet.
* **Real-Time Updates**: Push notifications to alert users about new episodes or manga updates for their favorite shows.
* **Advanced Error Handling**: Robust error handling mechanisms to ensure smooth user experience under various conditions, including handling API failures and poor network connectivity.

## Technologies Used

* **Kotlin**: The core programming language, used to build a performant and scalable app.
* **Jetpack Compose**: Modern UI toolkit for building native Android applications in a declarative way.
* **Retrofit**: Networking library to fetch anime data from remote APIs (e.g., Jikan API).
* **Coroutines**: For asynchronous programming and smooth handling of network operations.
* **Room Database**: To store user preferences, favorite anime, and manga data for offline access.
* **Glide/Picasso**: Image loading libraries to display anime posters, manga covers, and more efficiently.
* **Firebase Cloud Messaging (FCM)**: Push notifications to notify users about updates and new content.
* **Dagger-Hilt**: Dependency injection for easier and more manageable code architecture.
* **JUnit/Mockk**: Unit testing and mocking libraries for ensuring reliable and testable code.

## Installation

To get started with OtakuCode, follow these steps:

### 1. Clone the repository

```bash
git clone https://github.com/zenkriztao/otaku-code.git
```

### 2. Open the project in Android Studio

* Open the `OtakuCode` project in [Android Studio](https://developer.android.com/studio).
* Ensure you have the required SDK and Kotlin version installed.

### 3. Install dependencies

If you’re using **Gradle** for dependency management (which is standard for Kotlin projects), run:

```bash
./gradlew build
```

This will download all necessary dependencies.

### 4. Set up API Keys

* Register for access to the [Jikan API](https://jikan.moe/) or other anime-related APIs if required.
* Store your API keys securely in the appropriate configuration files, such as `gradle.properties` or `.env`.

### 5. Run the App

After ensuring all dependencies are set, simply run the app using Android Studio’s built-in emulator or a physical Android device.

```bash
Run -> Select device -> Start app
```

The app should launch and display a list of anime based on the API.

## Usage

1. **Browse Anime**: Navigate through the app to explore various anime genres, find details, and view covers.
2. **Search for Anime**: Use the search bar to find specific anime by title, genre, or rating.
3. **Mark Favorites**: Add anime to your favorites for quick access later.
4. **Offline Mode**: Enjoy watching your favorite shows even without an internet connection.
5. **Push Notifications**: Get real-time updates for new episodes and manga chapters.

## Architecture

The project follows **MVVM** (Model-View-ViewModel) architecture with clean separation of concerns, ensuring scalability and maintainability.

* **Model**: Data classes for managing anime and manga information, along with network and database handling.
* **View**: UI components managed by Jetpack Compose, with state-driven UI updates.
* **ViewModel**: Logic for data fetching, processing, and updating the UI, using Kotlin Coroutines for background operations.
* **Repository**: Responsible for fetching data from either local storage (Room) or remote APIs (Retrofit).
* **Use Cases**: A set of well-defined actions the app can perform, facilitating code reusability.

## Contributing

Contributions are welcome to make OtakuCode even better! If you'd like to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to your branch (`git push origin feature-branch`).
5. Submit a pull request.

Please ensure that your code adheres to the Kotlin best practices and follows the **Clean Code** principles.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
