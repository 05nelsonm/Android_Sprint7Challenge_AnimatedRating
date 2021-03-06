# Android User Interface Sprint Challenge Animated Rating

### Instructions

**Please read this entire README to make sure you understand what is expected of you before you begin.**

This sprint challenge is designed to ensure that you are competent with the concepts taught throughout this sprint.

In your solution, it is especially important that you follow best practices such as MVC and good, consistent code style. You will be scored on these aspects as well as the project MVP (minimum viable product) requirements below.

Fork this repository and clone your fork to your computer. Create your Android Studio project in this cloned fork repository folder, then commit and create a pull request. Commit appropriately as you work. When finished, push your final project to GitHub and comment on the pull requestto indicate that your project is complete.

You have *3 hours*, and you should work *independently* — looking things up (search, notes) is all fair game. And questions about *process* / *logistics* (i.e. if you have a hard time opening/saving to GitHub) are fair game too.

Good luck!

### Screen Recording

This screen recording previews the look and feel of a completed project that meets the MVP requirements for this project.

<img src="animatedRatingBar_app_new.gif" width="300">

This is a recording demonstrating the base functionality of the app. Use what we've learned to make it look better.

## Requirements

This project will have you creating an animatable rating bar which can accept custom attributes for a number of variables you'll have to manage. You will also create a fragment displayed as a dialog fragmet to allow users to add entries and rate them.

The requirements for this project are as follows:

1. A custom view which users can set and read ratings from

2. The view must allow for attributes to be set:
    1. The maximum rating (number of symbols)
    2. The starting rating
    
> Start building the view using static values for these fields.
> To add multiple symbols, your view should extend a child of viewgroup, I like to use the frame layout. You will also have to define the symbols as their own views, I like defining them in their own layout and then inflating that layout multiple times

3. The view must allow activity code to set or get the rating

4. The view must use AnimatedVectorDrawable images and animate them when the rating is changed. (BONUS: allow images to be set in the xml)
> You'll need to create an animation for an empty star that is filled and a full start that is emptied
> Remember, if you start the animation when the layout is initialized, you will only see the final product and not the naimation transition

5. The view must be used in a fragment to allow users to add rated items to a list. This list will be displayed in a simple layout
> you can just add views programmatically to a linear layout for the list BONUS: implement a recycler view
> This can be either a dialog fragment or a full fragment (BONUS: for full fragment for the edit view and for the list view)

6. After the rating item is added the the list, the user will be able to select it and alter the rating
> Pass the data (name and rating) into the dialog fragment using a bundle
> It is easiest to remove the item from the list by calling `removeView` on the parent and passing in the view object to be removed. ANd then add the view like you did before

Challenge:
Completing all the requirements correctly and 2 bonus requirements can qualify you for a 3. Bonus requirements do not replace the normal requirements.
