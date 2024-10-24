# Ribbon

Ribbon は Paper 用のデバッグユーティリティプラグインです. (インスパイア: ちゅずめさんの [Chuzume-s-Toolbox](https://github.com/Chuzume/Chuzume-s-Toolbox))

https://github.com/user-attachments/assets/b2e1bbf4-0f89-4e8a-aada-b085d6f4c94d

*Support Minecraft Version: 1.21.X*

## 機能

- ゲームモードの即時切り替え（クリエイティブ／サバイバル）
- OPトグル
- 即時回復（体力／満腹度／アクティブなステータス効果）
- 飛行モードの切り替え
- ワールドからのエンティティ除去
- 難易度切り替え（ノーマル／ピースフル）
- XPコントロール

## 導入

1. [GitHub](https://github.com/m1sk9/Ribbon/releases/latest) または [Modrinth](https://modrinth.com/project/ribbon) から最新版の Ribbon をダウンロードします.
2. ダウンロードしたファイルを `plugins` フォルダに移動します.
3. サーバーを起動します.

## 使い方

### デバッグツール

- `/ribbon` でアイテムを取得します. 各アイテムは右クリック or **シフトしながら** 右クリックで使用できます. それぞれ効果が異なります.

<!-- image -->

### サウンドボード

- `/ribbon soundboard` で Minecraft のサウンドボードを開くことができます. インベントリから再生したいサウンドを選択して再生できます.

<!-- image -->

### 注意事項

- Ribbon はデバッグ用のツールです. 本番環境での使用は次の理由により推奨されません.
  - デバッグ用の機能のため, パーミッションによる使用制限は行われていません (権限管理プラグイン導入の手間省くため)
  - OP の切り替えなどを容易に行える機能が含まれています
  - その他, デバッグ用途に特化した機能が含まれています
- アイテム使用のためのイベント (`PlayerInteractEvent` など) は他のプラグイン側の処理を妨害しないよう優先度は低く設定されています.
- Ribbon は Paper に最適化されています. Spigot などの他のサーバーソフトウェアでの動作は保証されません.

## ライセンス

Ribbon は GNU General Public License v3.0 に基づいてライセンスされています.

詳しくは [LICENSE](LICENSE) を参照してください.

<sub>
  © 2024 m1sk9 - Ribbon は Mojang Studio および Microsoft とは関係ありません.
</sub>
  
