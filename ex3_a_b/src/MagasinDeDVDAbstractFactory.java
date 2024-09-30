public class MagasinDeDVDAbstractFactory implements MagasinAbstractFactory{

  @Override
  public MagasinDeDVD creerMagasin() {
    return new MagasinDeDVD();
  }
}
