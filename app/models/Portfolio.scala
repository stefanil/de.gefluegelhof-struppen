/**
 *
 */
package models

import controllers.AssetUtil

/**
 * @author stefan.illgen
 *
 */
object Portfolio {
  
  def apply:Seq[ProductLine] = return Seq[ProductLine](
		new ProductLine("Frische Eier", Seq[Product](
		    new Product(AssetUtil.getLogoImg, "braune und weiße Eier aus Bodenhaltung"),
		    new Product(AssetUtil.getLogoImg, "Hausmacher  Eier -, Mokka - und Schokolikör"))),
		new ProductLine("Pasta", Seq[Product](
		    new Product(AssetUtil.getLogoImg, "Hausmacher Frischeinudeln in verschiedenen Ausformungen"),
		    new Product(AssetUtil.getLogoImg, "Glutenfreie Nudeln"),
		    new Product(AssetUtil.getLogoImg, "Dinkelnudeln"),
			new Product(AssetUtil.getLogoImg, "Frischeibandnudeln in den Geschmacksrichtungen Knoblauch, Steinpilz, Ingwer," + 
			"Tomate.Basilikum, Spinat, Bärlauch, Chili,  Basilikum und Kartoffelnudeln"))),
		new ProductLine("Geschenkideen", Seq[Product](
		    new Product(AssetUtil.getLogoImg, "Präsentkörbe"),
			new Product(AssetUtil.getLogoImg, "Deko & Geschenkartikel ( Keramik, Kerzen, Servietten u.v.m. )"),
		    new Product(AssetUtil.getLogoImg, "Nudeleimer, Puppen, Sträuße")
			)),
		new ProductLine("Dies & Das", Seq[Product](
		    new Product(AssetUtil.getLogoImg, "Freßsäcke  ( Gefüllt mit Produkten aus unserem Sortiment )"),
		    new Product(AssetUtil.getLogoImg, "Dinkelkekse & Waffeln"),
		    new Product(AssetUtil.getLogoImg, "Suppeneinlagen"),
		    new Product(AssetUtil.getLogoImg, "Honig vom Imker"),
		    new Product(AssetUtil.getLogoImg, "Futtermittel für Hühner, Hund, Katze, Kaninchen, Taube u.v.m.")))
	)

}