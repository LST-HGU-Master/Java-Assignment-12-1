# 課題 12-1: 文字列

### 課題の説明
次に示す文字列はDNA塩基配列をATGCの4文字で表現したものである。

`ATTGAACGGTTGTGTTGATGCATCAGAATGGTTT`

このDNA文字列を保持するフィールドと、DNA文字列の塩基対となる文字列を生成するメソッドをもつDNAクラスを作成しなさい。
ただしDNAは AがT と、GはC と必ず対になる。

### DNAクラスのメンバ

| フィールド名 | 型 | 初期値  | アクセス修飾子 |
|-----|-----|------|-----------------|
| str | String | 空文字列 | public  | 

| メソッド名 | 引数のリスト | 戻り値  | アクセス修飾子 |
|-------|---------|------|--------|
| getPair   | なし  | String | public | 

### ProgC1.java (変更・提出不要)
```java
public class ProgC1 {

    public static void main(String[] args) {
        DNA dna = new DNA();
        dna.str = "ATTGAACGGTTGTGTTGATGCATCAGAATGGTTT";
        System.out.println(dna.getPair());
    }

}
```

### ProgC1.main()の実行結果
```
TAACTTGCCAACACAACTACGTAGTCTTACCAAA
```