# CaesarCrypt
This Java program applies a Caesar cipher to user input and prints all 26 possible encrypted variants, each corresponding to a different letter shift in the alphabet.

# Showcase on how a Java-repository should look like
This is also a great showcase on how a Java-Repo should generally look like. 

## src-folder
For a GitHub repository it is generally recommended to use a folder "src" for all the source code. Here is an example how java code should be embedded inside the src-folder:

    /project-root
        /src
            /main
            /ressources
                /java
                    /com 
                        /yourcompany
                            /logic
                                code.java
                            /ui
                                code.java

    /src -> Project code
    /main -> Productive segment of the code
    /ressources -> Ressources like Properties, XML, JSON, Pictures
    /java -> Java-linked code
    /com/yourcompany -> Name of the company, so that name-conflict is prevented
    /logic or /ui -> Example of how you could structure with the use of modules