# Modern Android Development (MAD) Skills with Kotlin and Jetpack Compose

## This is the first project. A Simple Happy Birthday App!

Training course [here](https://developer.android.com/codelabs/basic-android-kotlin-compose-text-comosables?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-1-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-text-composables)

<i>
    In this file, I write down what I learned as I cover the tutorial.
</i>

### What I've learned in this project

#### What is a user interface (UI)?
<b> (Copied directly from course website) </b>
The user interface (UI) of an app is what you see on the screen: text, images, buttons, and many 
other types of elements, and how it's laid out on the screen. It's how the app shows things to the 
user and how the user interacts with the app.

#### What is Jetpack Compose?
Jetpack Compose is a modern toolkit for building Android UIs. Compose simplifies and accelerates UI 
development on Android with less code, powerful tools, and intuitive Kotlin capabilities. With Compose, 
you can build your UI by defining a set of functions, called composable functions, that take in data 
and describe UI elements.

###### Composable functions
Composable functions are the basic building block of a UI in Compose. A composable function:

- Describes some part of your UI.
- Doesn't return anything.
- Takes some input and generates what's shown on the screen.

##### Annotations
Annotations are means of attaching extra information to code. This information helps tools like the 
Jetpack Compose compiler, and other developers understand the app's code.
An annotation is applied by prefixing its name (the annotation) with the `@` character at the 
beginning of the declaration you are annotating. Different code elements, including properties, 
functions, and classes, can be annotated. Later on in the course, you'll learn about classes.

Annotations can be witten with or without parameters. Parameters help the annotation function do 
"extra things" than normal than what they normally do. For example, here is a `@Preview` annotation 
with parameters:

```@Preview(showBaground = true, showSystemUI = true)```
```@Composable```
```// You composable here...```


##### Fonts
**_Scalable pixels_**
The scalable pixels (SP) is a unit of measure for the font size. UI elements in Android apps use two 
different units of measurement: density-independent pixels (DP), which you use later for the layout, 
and scalable pixels (SP). By default, the SP unit is the same size as the DP unit, but it resizes 
based on the user's preferred text size under phone settings


### Tips and Tricks
> Pass the modifier along with the attributes in the parent composable
> Its a good idea to use padding values in multiples of 4.dp


### Questions and doubts
1) How do I know that a property belongs to the modifier or to the composable? For example, how do I 
know that `verticalAlignment` is a _direct_ property of `Column` in the code below?