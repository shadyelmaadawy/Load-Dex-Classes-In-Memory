# Load Dex Classes In-Memory

###  *Here's to the ones who see things differently*

Every time I jumped to the office when I was a classic employee in companies, I heard them talking about which tool is better, Java or Koltin, MVP Or MVVM, Node JS Or .NET etc.. unfortunately, they did not talk about my tank : ( 

I joined in a conversation with a .NET 'Expert' and it was about reflection, he said it makes the project very slow, unstable, and uses a lot of memory,
Isn't this world really weird? I have used reflection since a decade ago and never faced that before, to be honest, this conversation caused me a headache, 

I think he loads the module inside a loop, Invoke one function, and does not give a shit for memory management, or unloads this module after he uses it, or even saves a reference for it for upcoming usage ( if he needs that )

So? today I will give you a REAL-WORLD HEADACHE, and it's far from .NET This time ; )

# Note:
Before we jump into the next section, you can execute this idea with any Operation system, for example:

- IOS/macOS:
    - [ macOS Example ](https://github.com/shadyelmaadawy/Load-And-Execute-Dynamic-Libraries-With-Swift_CPP-IN-OS-X), [  Mach-O File Structure APPLE Source ](https://opensource.apple.com/source/xnu/xnu-4570.71.2/EXTERNAL_HEADERS/mach-o/loader.h.auto.html) 
- Windows: 
    - .NET: Reflection Assembly
    - In Native Platforms: LoadLibrary, Manual Mapping... etc.
- Android:
    - [Dex Loader](https://developer.android.com/reference/dalvik/system/InMemoryDexClassLoader) - ( I did not tell you that I had been there ? Sorry.. I don't say everything LOL )
- Linux/Unix:
    - ELF Loader

# Brainstorming

As usual, a few lines of code leaked from my arsenal, but more and more ideas will be out there after that, I do not share code, I share ideas.

What do we have for today? An approach, with an idea to write a real-world scalable system, I like to write *light-weight* software, but that doesn't mean I don’t write *heavy-weight* modules!

If your project looks like this [#](https://github.com/shadyelmaadawy/Anubis-Vault), you follow the wrong approach, I don't like chaos, but I like creating it!

Even If looks like that: 

![](https://i.stack.imgur.com/qeoyL.png)

It is neither right nor wrong, What I know is you're not following an approach, you just set blocks next to each other,
Maybe linking child projects with parent projects, as a reference or something, and using them with each other makes you slip from my judgment.

You will split your project into modules, and every module will be responsible for something, but a module will be heavy with features inside, as example Booking App:

* Module A:
    - Flights
    - buses
    - Boats

* Module B
    - History
    - Status
    - etc

And every module has dozens of features, and every feature has a huge codebase, we talking here about something like Safari, Xcode, or similar, not a small project at all.
But why are we doing that? let me ask you something.

Why are you applying SOLID principles? To make designs easier to understand, maintain, and extend.. etc

This is the same, If you have a real-world large-scale system, you need to apply this approach or anything similar, 
A source code with 50K lines of code ( and it's a very small amount ) is like a forest, takes days to understand and compile LOL

Loader:

![](https://raw.githubusercontent.com/shadyelmaadawy/Load-Dex-Classes-In-Memory/master/Loader.png)

Instance ( Dex File ):

![](https://raw.githubusercontent.com/shadyelmaadawy/Load-Dex-Classes-In-Memory/master/Instance.png)

Result Of Execute Dex In Memory:

![](https://raw.githubusercontent.com/shadyelmaadawy/Load-Dex-Classes-In-Memory/master/Result.png)


But now, you can even Invite a developer to be part of one modules without giving him an access to the whole source code ; )

#### Note:

***Do not forget to enable multiDexEnabled option in the gradle***

# To infinity and beyond!

You can execute this approach but is not ideal for small-scale projects, for example, a simple E-Commerce project, MVVM will be more than enough, If you apply this approach, it will be Over-kill!

With real Large-scale projects, when a module has about ten sub-features, you can and need to apply this approach, and you will be happy, you can even apply different architecture pattern that fits every module business logic, 

Haven't you faced that before? and felt confused about what should you do? do not worry, that happens to the best of us ;  )

# Credits
### Copyright (©) 2023, Shady K. Maadawy, All rights reserved.
  [@shadudiix](https://github.com/shadyelmaadawy)
