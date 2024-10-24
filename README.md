[日本語版](./README-ja.md)

# Ribbon

Ribbon is a debug utility plugin for Paper. (Inspired by [Chuzume-s-Toolbox](https://github.com/Chuzume/Chuzume-s-Toolbox))

https://github.com/user-attachments/assets/b2e1bbf4-0f89-4e8a-aada-b085d6f4c94d

*Support Minecraft Version: 1.21.X*.

## Function

- Instant game mode switching (Creative / Survival)
- OP toggle
- Instant recovery (strength / satiety / active status effects)
- Switching flight modes
- Entity removal from the world
- Toggle difficulty (Normal / Peaceful)
- XP Control

## Introduction

1. Download the latest version of Ribbon from [GitHub](https://github.com/m1sk9/Ribbon/releases/latest) or [Modrinth](https://modrinth.com/project/ribbon).
2. Move the downloaded file to the `plugins` folder.
3. Start the server.

## Usage

### Debugging Tools

- Get items in `/ribbon`. Each item can be used by right-clicking or **shifting** right-clicking. Each item has a different effect.

![image](https://github.com/user-attachments/assets/7f8b4d6d-1df3-4288-a7b5-e42cef04d613)

### sound board

- You can open the Minecraft soundboard at `/ribbon soundboard`. You can select the sound you want to play from your inventory.

![image](https://github.com/user-attachments/assets/3a02037e-1f3d-49c4-8a4f-6cbc573af86a)

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
