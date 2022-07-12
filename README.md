# intellij-vlang
![Build](https://github.com/nedpals/intellij-vlang/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [ ] Get familiar with the [template documentation][template].
- [ ] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [ ] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
The soon-to-be-official plugin of the [V Language](https://github.com/vlang/v) for the IntelliJ Platform (IDEA, WebStorm, CLion, GoLand, etc.)
<!-- Plugin description end -->

## What's working
- [ ] V Language Server (using [ballerina-platform/lsp4intellij](https://github.com/ballerina-platform-lsp4intellij) on master)
  - [ ] Completion (I don't know why lol)
  - [x] Hover
  - [x] Diagnostics (V diagnostics' never fired because it never triggers `textDocument/didSave` but only `textDocument/willSave`)
  - [x] Text Manipulation (works except when deleting characters and/or client sends negative/inaccurate positions)
  - [ ] Go to Definition (the client does not understand the returned result the server provides)
  - [ ] Formatting
  - There are features not listed because of the LSP client does not fully implement the LSP spec
- [ ] Syntax Highlighting (I was hoping [jetbrains/jsitter](https://github.com/jetbrains/jsitter) would work in order to utilize the existing tree-sitter grammar but anyway)
- [ ] UI for Plugin Settings

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "intellij-vlang"</kbd> >
  <kbd>Install Plugin</kbd>
  
<!--
- Manually:

  Download the [latest release](https://github.com/nedpals/intellij-vlang/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>
-->

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
