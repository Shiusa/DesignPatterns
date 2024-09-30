public class MagasinDeLivreAbstractFactory implements MagasinAbstractFactory {

  @Override
  public MagasinDeLivre creerMagasin() {
    return new MagasinDeLivre();
  }
}
