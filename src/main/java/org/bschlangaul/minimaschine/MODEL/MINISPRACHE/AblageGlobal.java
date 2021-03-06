package org.bschlangaul.minimaschine.MODEL.MINISPRACHE;

class AblageGlobal extends Ablage {
  private String name;

  AblageGlobal(String string, boolean bl) {
    super(null, bl);
    this.name = string;
  }

  @Override
  void Laden(AssemblerText assemblerText) {
    assemblerText.BefehlEintragen(null, "LOAD", this.name);
  }

  @Override
  void Operation(AssemblerText assemblerText, String string) {
    assemblerText.BefehlEintragen(null, string, this.name);
  }

  @Override
  void AdresseLaden(AssemblerText assemblerText, boolean bl) {
    assemblerText.BefehlEintragen(null, bl ? "ADD" : "LOAD", "$" + this.name);
  }
}
