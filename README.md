# HelloConstraint 

## About the Project

HelloConstraint is a simple Android application developed in **Java using Android Studio**. The project demonstrates how to create an interactive user interface using `ConstraintLayout`, buttons, and a `TextView`.

The application allows users to display a Toast message, increase a counter, and reset it to zero. It also changes button colors depending on user interactions.

## Features

### 1. Toast Button
- Displays a short message saying **"Hello Toast!"** when clicked.
- Uses `Toast.makeText()` to display the notification.

### 2. Count Button
- Increases the counter by 1 each time it is pressed.
- Updates the number displayed in the `TextView`.
- Changes its background color depending on the counter value:
  - **Green** – Even numbers.
  - **Red** – Odd numbers.
- Changes the Zero button's background color to yellow when the counter is increased.

### 3. Zero Button
- Resets the counter to **0**.
- Changes its background color back to gray.
- Changes the Count button's background color to blue.

### 4. Responsive Layouts
The application supports three different layouts:

- **Default (`layout`)** – Standard phone screens.
- **Landscape (`layout-land`)** – Phones in horizontal orientation.
- **Extra Large (`layout-xlarge`)** – Larger screens and tablets.

The buttons are positioned using `ConstraintLayout`, allowing the interface to adapt to different screen sizes and orientations.

## Technologies Used

- **Java** – Application logic and button interactions.
- **XML** – User interface design.
- **Android Studio** – Development environment.
- **ConstraintLayout** – Positioning and aligning UI elements.
- **Git and GitHub** – Version control.

## How the Application Works

When the application starts, the counter is set to **0**, and the Zero button has a gray background.

Pressing the Count button increases the displayed number and changes the button's color based on whether the number is even or odd.

Pressing the Zero button resets the counter and restores the Zero button's gray background.

All button interactions are handled in `MainActivity.java` using `setOnClickListener()`.

## Project Structure

```text
app/src/main/
├── java/com/example/helloconstraint/
│   └── MainActivity.java
└── res/
    ├── layout/
    │   └── activity_main.xml
    ├── layout-land/
    │   └── activity_main.xml
    ├── layout-xlarge/
    │   └── activity_main.xml
    └── values/
        ├── colors.xml
        ├── strings.xml
        └── themes.xml
```

## Running the Application

1. Download or clone the repository.
2. Open the project in Android Studio.
3. Wait for Gradle synchronization to finish.
4. Select an Android emulator or connect a physical Android device.
5. Click **Run** to launch the application.
6. Test the buttons and rotate the device to view the different layouts.

## Repository

[HelloConstraint – GitHub](https://github.com/TristanCebron/HelloConstraint)

## Conclusion

This project demonstrates basic Android development concepts, including interactive buttons, click listeners, updating UI elements, changing background colors, and designing 

layouts for different screen sizes.

<img width="223" height="475" alt="Screenshot 2026-10-18 212000" src="https://github.com/user-attachments/assets/45410283-b26d-4f5f-a1e5-7bab7ce89a28" /><img width="501" height="236" alt="Screenshot 2026-10-18 211952" src="https://github.com/user-attachments/assets/bb8a9141-2602-430c-a155-6d75c566922e" />
