package code
package snippet

import net.liftweb._
import http._
import js._
import JsCmds._
import JE._

import comet.{ChatServer,MovieBot,ChatMessage}

/**
 * ChatIn snippet
 */
object SetUsername {

  object username extends SessionVar[Box[String]](Empty)
  
  def render = SHtml.onSubmit(s => {
    ChatServer ! ChatMessage("user", s)
    MovieBot ! ChatMessage("user", s) 
    SetValById("chat_in","")
  })
}