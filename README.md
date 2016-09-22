# My Todo List

**My Todo List** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Akash Ungarala**

Time spent: 12 hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [x] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [x] Add support for selecting the priority of each todo item (and display in listview item)
* [x] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [x] Persist the todo items into Firebase instead of a text file
* [x] Use a Fragment for adding new task as a new form with details
* [x] Use a Date Picker Dialog for selecting the due date for a task
* [x] Sorted the list of tasks based on the status ('Todo' and then 'Doing' and then 'Done')
* [x] Sorted the list of tasks based on the priority level ('High' and then 'Medium' and then 'Low')
* [x] Use a Fragment instead of new Activity for editing items
* [x] Use an alert dialog to confirm for deletion of a task
* [x] Validations for task details, preventing addition of new task or updation of selected task with already existing task name

## Video Walkthrough 

Here's a walkthrough of implemented user stories:

![mytodolist](https://cloud.githubusercontent.com/assets/7720015/15989521/70eb49a6-3046-11e6-9678-b24e295674de.gif)

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Cloning the Project

Get started by cloning the project to your local machine: https://github.com/akashungarala/My-Todo-List


## Build Configuration

This project was build on Java SDK 1.6+ (JRE 1.7.0_79), Android SDK, Firebase.

We assume here the Android emulator (GenyMotion virtual android device with minimum SDK version of 16) is up and running.


## Project Structure

AndroidManifest.xml - This file contains essential information the Android system needs to run the application's code. It is a required file, and is the mechanism you use to show your application to the user (in the app launcher's list), handle data types, etc.


src/* - Under this directory is the Java source for your application.


src/com.akashungarala.simpletodo/SplashActivity.java - Launcher activity diplaying the logo of the application to the user

src/com.akashungarala.simpletodo/MainActivity.java - Main activity deals with the business implementation of the application with different fragments

src/com.akashungarala.simpletodo/Task.java - Class representation for task with attributes task name, priority level, task notes etc.

src/com.akashungarala.simpletodo/TaskAdapter.java - Adapter class for setting all the tasks from the firebase server to the list fragment

src/com.akashungarala.simpletodo/ListFragment.java - Displays the list of tasks and provides an option to add a new task

src/com.akashungarala.simpletodo/AddFragment.java - Creates new task or edits existing task from the details provided by the user

src/com.akashungarala.simpletodo/DetailFragment.java - Displays the details of the task selected from the list and also provides options to edit or remove the task


res/* - Under this directory are the resources for your application.


The res/layout/ directory contains XML files describing user interface view hierarchies.


res/layout/activity_splash.xml.xml - It is used by SplashActivity.java to construct its UI.

res/layout/activity_main.xml.xml - It is used by MainActivity.java to construct its UI.

res/layout/fragment_list.xml.xml - It is used by ListFragment.java to construct its UI.

res/layout/fragment_add.xml.xml - It is used by AddFragment.java to construct its UI.

res/layout/fragment_detail.xml.xml - It is used by DetailFragment.java to construct its UI.

res/layout/add_button.xml.xml - It is used as a footer for the list of tasks displayed in the layout fragment_list.xml

res/layout/task_row.xml.xml - It is used to represent a view element of the list in the layout fragment_list.xml

res/layout/priority_dropdown.xml.xml - It is used to represent a view element of the priority level dropdown in the layout fragment_add.xml

res/layout/priority_selected_item.xml.xml - It is used to represent a view element of the priority level selected item in the layout fragment_add.xml

res/layout/status_dropdown.xml.xml - It is used to represent a view element of the status dropdown in the layout fragment_add.xml

res/layout/status_selected_item.xml.xml - It is used to represent a view element of the status selected item in the layout fragment_add.xml


The res/drawable/ directory contains images and other things that can be drawn to the screen. These can be bitmaps (in .png or .jpeg format) or special XML files describing more complex drawings.


res/values/colors.xml, res/values/strings.xml, res/values/styles.xml - These XML files describe additional resources included in the application. They all use the same syntax; all of these resources could be defined in one file, but we generally split them apart as shown here to keep things organized.
