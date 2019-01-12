# Android_Sprint7Challenge_AnimatedRating

### Instructions

**Please read this entire README to make sure you understand what is expected of you before you begin.**

This sprint challenge is designed to ensure that you are competent with the concepts taught throughout Sprint 7.

In your solution, it is especially important that you follow best practices such as MVC and good, consistent code style. You will be scored on these aspects as well as the project MVP (minimum viable product) requirements below.

Fork this repository and clone your fork to your computer. Create your Android Studio project in this cloned fork repository folder, then commit and create a pull request. Commit appropriately as you work. When finished, push your final project to GitHub and comment on the pull requestto indicate that your project is complete.

You have *3 hours*, and you should work *independently* — looking things up (search, notes) is all fair game. And questions about *process* / *logistics* (i.e. if you have a hard time opening/saving to GitHub) are fair game too.

Good luck!

### Screen Recording

This screen recording previews the look and feel of a completed project that meets the MVP requirements for this project.

<img src="https://github.com/LambdaSchool/Android_Sprint4Challenge_MyMovies/blob/master/myMoviesDemo_shorter.webm" width="300">

## Requirements

This project will have you creating an animatable rating bar which can accept custom attributes for a number of variables you'll have to manage.

The requirements for this project are as follows:

1. A custom view which users can set and read ratings from

2. The view must allow for attributes to be set:
    1. The maximum rating (number of symbols)
    2. The starting rating
    3. The empty symbol
    4. The filled symbol

3. The view must allow activity code to set or get the rating

4. The view must handle AnimatedVectorDrawable images and animate them when the rating is changed.
> Be sure to check if each drawable implements `Animatable` before trying to animate or your app will crash. 
