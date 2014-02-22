/**
 *
 */
package models

/**
 * @author stefan.illgen
 *
 */
class ProductLine(name:String = "A_PL", products:Seq[Product] = Seq()) {

	def getName = name
	def getProducts = products
  
}