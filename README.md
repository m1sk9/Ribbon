[日本語版](./README-ja.md)

# Ribbon

Ribbon is a debug utility plugin for Paper. (Inspired by [Chuzume-s-Toolbox](https://github.com/Chuzume/Chuzume-s-Toolbox))

*Support Minecraft Version: 1.21.X*.

## Introduction

1. Download the latest version of Ribbon from [GitHub](https://github.com/m1sk9/Ribbon/releases/latest) or [Modrinth](https://modrinth.com/project/ribbon).
2. Move the downloaded file to the `plugins` folder.
3. Start the server.

## Usage

- Get items by `/ribbon`.
- Each item can be used by right-clicking on it. How to use the item depends on the item. For details, see the Lore of the item.

### Notes

- Ribbon is a debugging tool. It is not recommended to use it in the production environment for the following reasons.
    - Ribbon is a debugging tool, so its usage is not restricted by permissions (to avoid installing permission management plugin).
    - It includes a function to easily switch OPs, etc.
    - Other functions specialized for debugging are included.
- Events for item use (`PlayerInteractEvent`, etc.) are given low priority so as not to interfere with other plugin processing.
- Ribbon is optimized for Paper. It is not guaranteed to work with other server software such as Spigot.

## License

Ribbon is licensed under the GNU General Public License v3.0.

See [LICENSE](LICENSE) for details.

<sub>
  © 2024 m1sk9 - Ribbon is not affiliated with Mojang Studio and Microsoft.
</sub>
