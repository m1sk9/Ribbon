# Ribbon

Ribbon は Paper 用のデバッグユーティリティプラグインです. (インスパイア: [chuzume's chuzu_toolbo](https://chuzume.hatenablog.jp/entry/chuzu_toolbox))

*Support Minecraft Version: 1.21.X*

## 導入

1. [GitHub]() または [Modrinth]() から最新版の Ribbon をダウンロードします.
2. ダウンロードしたファイルを `plugins` フォルダに移動します.
3. サーバーを起動します.

## 使い方

- `/ribbon items` または `/ribbon items spawn` でアイテムを取得します.
- 各アイテムは右クリックで使用できます. 使用方法などはアイテムによって異なります. 詳しくはアイテムの Lore を確認してください.

### 注意事項

- Ribbon はデバッグ用のツールです. 本番環境での使用は次の理由により推奨されません.
  - デバッグ用の機能のため, パーミッションによる使用制限は行われていません (権限管理プラグイン導入の手間省くため)
  - OP の切り替えなどを容易に行える機能が含まれています
  - その他, デバッグ用途に特化した機能が含まれています
- アイテム使用のためのイベント (PlayerInteractEvent など) は他のプラグイン側の処理を妨害しないよう優先度は低く設定されています.
- Ribbon は Paper に最適化されています. Spigot などの他のサーバーソフトウェアでの動作は保証されません.

## ライセンス

Ribbon は GNU General Public License v3.0 に基づいてライセンスされています.

詳しくは [LICENSE](LICENSE) を参照してください.

<sub>
  © 2024 m1sk9 - Ribbon は Mojang Studio および Microsoft とは関係ありません.
</sub>
  
