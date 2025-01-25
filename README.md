> [!IMPORTANT]
>
> This branch is a backport version for Minecraft 1.18.2.

# Ribbon

Ribbon is a debug utility plugin for Paper.

~~*Support Minecraft Version: 1.21.4*.~~ n - Backport for Minecraft 1.18.2

## Function

- Instant game mode switching (Creative / Survival)
- OP toggle
- Toggle difficulty (Normal / Peaceful)

## Introduction

1. Download the latest version of Ribbon from [GitHub](https://github.com/m1sk9/Ribbon/releases/latest) or [Modrinth](https://modrinth.com/project/ribbon).
2. Move the downloaded file to the `plugins` folder.
3. Start the server.

## Usage

Get items in `/ribbon`. Each item can be used by right-clicking or **shifting** right-clicking. Each item has a different effect.

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
  © 2024 ~ 2025 m1sk9 - Ribbon is not affiliated with Mojang Studio and Microsoft.
</sub>
