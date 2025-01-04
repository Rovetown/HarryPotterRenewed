> TODO: Add Shields for:
> https://shields.io/badges/modrinth-version,
> https://shields.io/badges/curse-forge-game-versions
> https://shields.io/badges/modrinth-game-versions
> https://shields.io/badges/curse-forge-downloads
> https://shields.io/badges/modrinth-downloads
> https://shields.io/badges/git-hub-downloads-all-assets-all-releases
> https://shields.io/badges/git-hub-actions-workflow-status
> https://shields.io/badges/travis-com-branch
> https://shields.io/badges/travis-com
> https://shields.io/badges/modrinth-followers
> https://shields.io/badges/git-hub-issues-or-pull-requests
> https://gist.github.com/gnaaruag/674a3d470c09825cb72ee9d8e128125b

![Project Banner](https://repository-images.githubusercontent.com/911762534/34d50d0d-f5e6-4392-9931-92ea6e28e2be)

<!--![GitHub forks](https://img.shields.io/github/forks/Rovetown/HarryPotterRenewed?style=for-the-badge)-->
<!--![GitHub followers](https://img.shields.io/github/followers/Rovetown?style=for-the-badge)-->
<!--![GitHub watchers](https://img.shields.io/github/watchers/Rovetown/HarryPotterRenewed?style=for-the-badge)-->

<div align="right">

![GitHub](https://img.shields.io/github/license/Rovetown/HarryPotterRenewed?style=for-the-badge)
![Discord](https://img.shields.io/discord/1324826601669787811?style=for-the-badge&logo=discord&logoColor=white&logoSize=auto&color=%235865F2&link=https%3A%2F%2Fdiscord.gg%2FKkdkGus3KT)
![GitHub top language](https://img.shields.io/github/languages/top/Rovetown/HarryPotterRenewed?style=for-the-badge&color=%23FF9900)

</div>

<!--![YouTube Channel Subscribers](https://img.shields.io/youtube/channel/subscribers/UCJ37rZi4370-FRp9ewjvRBw?style=for-the-badge&logo=youtube&logoColor=%23FF0000&logoSize=auto)-->
<!--![GitHub Release](https://img.shields.io/github/v/release/Rovetown/HarryPotterRenewed?sort=semver&filter=stable&display_name=release&style=for-the-badge)-->

## A Fabric mod that brings the magic of Harry Potter into Minecraft with spells, mobs, blocks, and more!

---

#### This project aims to immerse players in the wizarding world by adding iconic Harry Potter-inspired features to Minecraft.

#### Players will be able to cast spells, encounter magical creatures, and build with unique blocks that capture the charm and mystery of the series.

#### Designed for the Fabric mod loader, this mod is a magical adventure for fans and Minecraft enthusiasts alike!


# Getting Started

---

## Setting Up Your Java Development Environment

Follow these steps to prepare your system for working on this mod:

### 1. Install Git
Git is essential for managing version control and cloning this repository.

- **Windows**: Download the installer from [git-scm.com](https://git-scm.com/downloads) and follow the setup wizard.
> - **Mac**: Open a terminal and run:
> ```sh
> $ brew install git # Install Git using Homebrew
> ```
> Ensure you have [Homebrew](https://brew.sh/) installed, else the `brew` command will not work.

> - **Linux**: Use your package manager to install Git. For **Ubuntu**, run:
> ```sh
> $ sudo apt-get update # Update the package list to ensure you get the latest version
> $ sudo apt-get install git # Install Git
> ```

To verify the installation, run:
```sh
$ git --version # If all is well, this should print the installed Git version
```
### 2. Install Java Development Kit (JDK) 17/21
Fabric 1.21 requires Java 17+. Download and install the JDK from [AdoptOpenJDK](https://adoptopenjdk.net/).
For ease of installation, we provide you with the direct download link for for Java 17 and 21 for Windows below:
- [Java 17 LTS](https://objects.githubusercontent.com/github-production-release-asset-2e65be/372925194/52c35f75-041f-4ef0-bc8a-d6fe96d30c6e?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20250104%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250104T100426Z&X-Amz-Expires=300&X-Amz-Signature=47cb63fa1dfb8e5706401657ee99615c8594c8e54aad8b11d772a72714e1a0ba&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK17U-jdk_x64_windows_hotspot_17.0.13_11.msi&response-content-type=application%2Foctet-stream)
- [Java 21 LTS](https://objects.githubusercontent.com/github-production-release-asset-2e65be/602574963/736afa72-14dc-415e-9080-e20847b55d1c?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20250104%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250104T094037Z&X-Amz-Expires=300&X-Amz-Signature=ef4f274a9072a504c98a2b884a3e9a79ab21be2687777f93d3304b4f4c596984&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK21U-jdk_x64_windows_hotspot_21.0.5_11.msi&response-content-type=application%2Foctet-stream)

### 3. Install IntelliJ IDEA
IntelliJ IDEA is a powerful Java IDE that will help you develop this mod efficiently.

* **Download IntelliJ IDEA**: Visit [JetBrains](https://www.jetbrains.com/idea/) and download the Community Edition, which is free and suitable for this project.
  * **FOR STUDENTS:** You can get the **Ultimate Edition** for free by using your student email address or signing up to [Github Education](https://github.com/education) and using your Github Account to sign in to JetBrains. 


* **Install IntelliJ IDEA**:  
  Follow the installation instructions specific to your operating system.


### 4. Set Up JDK 17/21 in IntelliJ**:
1. Launch IntelliJ IDEA.
2. Open the project you **[cloned from this repository](#1-clone-the-repository)**
3. Go to `File > Project Structure > SDKs`. 
4. Click the `+` button, select `Add JDK`, and choose the path where JDK 17 and/or JDK 21 is installed. If installed correctly, IntelliJ will recognize it.
5. Ensure JDK 17/21 is set as the default SDK for the project.


## Installing the Repository and run the Mod

---

#### 1. Clone the Repository
> Open your terminal in the directory where you want to have your Modding-Folder and execute:
> ```sh
> $ git clone https://github.com/Rovetown/HarryPotterRenewed.git
> ```

#### 2. Open the Project in IntelliJ IDEA
> If not done so already, download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
> * **HIGHLY RECOMMENDED:** Install the [Minecraft Development Plugin](https://plugins.jetbrains.com/plugin/8327-minecraft-development) for IntelliJ IDEA.
>
> Once you have IntelliJ installed, launch it.
>
> Navigate to `File` > `Open` and select the cloned repository (The folder you just got from the **git clone** command).
>
> Click open. IntelliJ will now load the project. Gradle will automatically start downloading the necessary dependencies.

#### 3. Refresh Gradle and Build the Project
> Once the project is loaded, you may need to manually refresh Gradle to ensure all dependencies are correctly set up.
>
> The refresh button can be found in the top left corner of the Gradle tab in IntelliJ IDEA or as a popup in the top right corner of your gradle files.
>
> To test if the mod is working and you run into no issues, open the *Gradle* window, navigate to `Tasks > fabric > runClient` and double-click `runClient`.
>
> If everything is set up correctly, Minecraft will start, and you can see the mod in the ModMenu.

# Troubleshooting

* If you get an error stating your JDK is not compatible or missing, you may need to install (a different version of) the JDK.
<br>
You can download the correct version from many different sources, but we recommend using [AdoptOpenJDK - LTS 21](https://objects.githubusercontent.com/github-production-release-asset-2e65be/602574963/736afa72-14dc-415e-9080-e20847b55d1c?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20250104%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20250104T094037Z&X-Amz-Expires=300&X-Amz-Signature=ef4f274a9072a504c98a2b884a3e9a79ab21be2687777f93d3304b4f4c596984&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK21U-jdk_x64_windows_hotspot_21.0.5_11.msi&response-content-type=application%2Foctet-stream).
* If gradle is not generating the minecraft sources, try running the `genSources` gradle task:
    ```sh
    $ ./gradlew genSources
    ```
  This will generate the sources for the Minecraft classes and should fix the issue.


* If you encounter any other issues, please refer to the [Fabric Wiki](https://fabricmc.net/wiki/start) for more information or ask in our [Discord](https://discord.gg/KkdkGus3KT).

## Contributing

---

If you want to contribute to this project, follow one of the steps below:

#### <ins>Simple quick contribution<ins>

1. `Fork` this repository
2. Create a `branch`
3. `Commit` your changes
4. `Push` your `commits` to the `branch`
5. Submit a `pull request`

#### <ins>More in-depth Guidelines<ins>

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for more details.

Check also the [list of contributors](CONTRIBUTORS.md) who helped on this project.

## Changelog :memo:

---

Find the latest Changelog [here](CHANGELOG.md).

## Acknowledgments :thumbsup:

---

> **[?]** Reference someone's code you used, insert an external link or thank people, i.e.:

* [Shields.io](http://shields.io/). Definitely a must-have.
* [Travis-CI](travis-ci.org). Another must-have. _Test and Deploy with Confidence_.
* [Github Actions](https://www.github.com/features/actions). _Automate your workflow from idea to production_.
* [GeckoLib](#). _IF WE WERE TO USE IT: A modding library for Minecraft Java and Bedrock Edition_.
* [And so on...](#). And so on... | _And so on..._. | *snort* | **snort** | ***snort***

## To-Do :man:

---

- [ ] Create Example Entities (Flyings, Humans, Creatures)
- [ ] Implement Example Textures (Items, Blocks, Mobs)
- [ ] Implement Example Blocks
- [ ] Implement Animated Entities and Textures (Items, Blocks, Mobs)
- [ ] Figure out how to use GeckoLib since GeckoLib its documentation is a mess (its non-existent) and not even ChatGPT can help?!?!?!??!?!
- [ ] Figure out how to use AzureLib and if its better than GeckoLib
- [ ] Figure out how to make Animations for Entities etc. without those 2 above and have them work with BlockBench
- [ ] So on...


## License

---

All rights reserved. &copy; 2025 [Rovetown](https://github.com/Rovetown).

Read more under [LICENSE](LICENSE)

