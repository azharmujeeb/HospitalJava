package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chatbot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chat Bot</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("          body {\n");
      out.write("    background-color:white;\n");
      out.write("}\n");
      out.write("textarea {\n");
      out.write("   background-color:white; \n");
      out.write("   color:black;\n");
      out.write("}  \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <textarea readonly=\"true\" id=\"botChat\"\n");
      out.write("         style=\"text-align:left;\n");
      out.write("          position:relative;   \n");
      out.write("          top:3vh; \n");
      out.write("          left: 380px;\n");
      out.write("          top: 100px;\n");
      out.write("          border:1px\n");
      out.write("          solid :black;\n");
      out.write("          width:700px;\n");
      out.write("          margin-left:1%;\n");
      out.write("          margin-right:2.25%;\n");
      out.write("          height:430px;\n");
      out.write("          resize:none;\n");
      out.write("          font-family:sans-serif;\n");
      out.write("          overflow-y:auto;\n");
      out.write("          font-style: bold;\n");
      out.write("          font-size:15px;\n");
      out.write("          background-color: #4b4276;\n");
      out.write("          color: white;\n");
      out.write("\t\t  display: flex;\n");
      out.write("\t\t  flex-direction: row;\n");
      out.write("\t\t  align-items: center;\n");
      out.write("\t\t  justify-content: center;\n");
      out.write("\t\t  padding: 10px 20px;\n");
      out.write("\t\t  border-top-left-radius: 20px;\n");
      out.write("\t\t  border-top-right-radius: 20px;\">\n");
      out.write("        \n");
      out.write("    </textarea>        \n");
      out.write("        <p style=\"position:absolute; \n");
      out.write("        border:none solid black;\n");
      out.write("         top: 540px; \n");
      out.write("         left: 403px;\n");
      out.write("          width: 884px;\">        \n");
      out.write("        <input type=\"text\" placeholder=\"Ask a question\" onKeypress=\"enterButton(event, document.getElementsByTagName('input')[0].value);\" onClick=\"answer(document.getElementsByTagName('input')[0].value)\"  style=\"color:black;\n");
      out.write("         background-color:white; \n");
      out.write("         width:79%;\n");
      out.write("         display: flex;\n");
      out.write("\t\tflex-direction: row;\n");
      out.write("\t\talign-items: center;\n");
      out.write("\t\tjustify-content: space-between;\n");
      out.write("\t\tpadding: 10px 20px;\n");
      out.write("\t\tbackground:#fff;\n");
      out.write("\t\tborder-bottom-right-radius: 10px;\n");
      out.write("\t\tborder-bottom-left-radius: 10px;\">        \n");
      out.write("      <!-- <button onClick=\"answer(document.getElementsByTagName('input')[0].value)\" \n");
      out.write("      style=\"background: #B23AEE;\n");
      out.write("      left: 150px;\"\n");
      out.write("      >send\n");
      out.write("    </button>  -->\n");
      out.write("    </p>\n");
      out.write("        \n");
      out.write("                <script>\n");
      out.write("    \n");
      out.write("var you = \"Me\";\n");
      out.write("botSays(\"Let us know what we can help you with?\")\n");
      out.write("            // Recognized Speech Patterns for Question Responses\n");
      out.write("var Hello = [\"HI\", \"HEY\", \"HOWDY\", \"HEYA\", \"HOLA\", \"HELLO\", \"SUP\", \"KONNICHIWA\", \"ALOHA\"]\n");
      out.write("var Goodbye = [\"BYE\", \"SEE YA\", \"CYA\", \"LATER\", \"ADIOS\", \"SAYONARA\", \"SEEYA\"]\n");
      out.write("var Greeting = [\"WHAT'S UP\", \"HOW'S IT GOING\", \"HOW ARE YOU\", \"NICE DAY\", \"GOOD MORNING\", \"GOOD NIGHT\"]\n");
      out.write("var Name = [ \"WHAT IS YOUR NAME\", \"WHAT'S YOUR NAME\", \"WHO ARE YOU\", \"WHAT DO THEY CALL YOU\", \"COMO TE LLAMAS\"]\n");
      out.write("var Actions = [\"HELP\", \"DRINK\", \"CHALLENGE\"]\n");
      out.write("var Questions = [\"QUESTION\", \"QUIZ\", \"CODE\", \"ANSWER\", \"HTML\", \"CSS\", \"JAVASCRIPT\"];\n");
      out.write("var HTMLTags1 = [\"<P>\", \"<I>\", \"<SPAN>\", \"<DIV>\", \"<ARTICLE>\", \"<IFRAME>\", \"<A>\", \"<ABBR>\",\"<ADDRESS>\",\"<AUDIO>\"];\n");
      out.write("        // Skip the CMD Line and learn HTML by reading my code!~~ LMAO, here have fun.\n");
      out.write("var HTMLTags2 = [\n");
      out.write("\"<A>\", //    Defines a hyperlink\n");
      out.write("\"<ABBR>\", //Defines an abbreviation or an acronym\n");
      out.write("\"<ACRONYM>\", //    Not supported in HTML5. Use <abbr> instead. Defines an acronym\n");
      out.write("\"<ADDRESS>\", //    Defines contact information for the author/owner of a document\n");
      out.write("\"<APPLET>\", //    Not supported in HTML5. Use <embed> or <object> instead. Defines an embedded applet\n");
      out.write("\"<AREA>\", //    Defines an area inside an image-map\n");
      out.write("\"<ARTICLE>\", //    Defines an article\n");
      out.write("\"<ASIDE>\", //    Defines content aside from the page content\n");
      out.write("\"<AUDIO>\", //    Defines sound content\n");
      out.write("\"<B>\" // Defines bold text\n");
      out.write("]\n");
      out.write("var HTMLTags3 = [\n");
      out.write("\"<BASE>\", // Specifies the base URL/target for all relative URLs in a document\n");
      out.write("\"<BASEFONT>\", //    Not supported in HTML5. Use CSS instead. Specifies a default color, size, and font for all text in a document\n");
      out.write("\"<BDI>\",    // Isolates a part of text that might be formatted in a different direction from other text outside it\n");
      out.write("\"<BDO>\",    //Overrides the current text direction\n");
      out.write("\"<BIG>\",    //Not supported in HTML5. Use CSS instead. Defines big text\n");
      out.write("\"<BLOCKQUOTE>\", //    Defines a section that is quoted from another source\n");
      out.write("\"<BODY>\",    //Defines the document's body\n");
      out.write("\"<BR>\",    //Defines a single line break\n");
      out.write("\"<BUTTON>\",    //Defines a clickable button\n");
      out.write("\"<CANVAS>\"    //Used to draw graphics, on the fly, via scripting (usually JavaScript)\n");
      out.write("]\n");
      out.write("var HTMLTags4 = [\n");
      out.write("\"<CAPTION>\",    //Defines a table caption\n");
      out.write("\"<CENTER>\", //    Not supported in HTML5. Use CSS instead. Defines centered text\n");
      out.write("\"<CITE>\", //Defines the title of a work\n");
      out.write("\"<CODE>\",    //Defines a piece of computer code\n");
      out.write("\"<COL>\",    //Specifies column properties for each column within a <colgroup> element \n");
      out.write("\"<COLGROUP>\",    //Specifies a group of one or more columns in a table for formatting\n");
      out.write("\"<DATALIST>\",    //Specifies a list of pre-defined options for input controls\n");
      out.write("\"<DD>\",    //Defines a description/value of a term in a description list\n");
      out.write("\"<DEL>\",    //Defines text that has been deleted from a document\n");
      out.write("\"<DETAILS>\",    //Defines additional details that the user can view or hide\n");
      out.write("\"<DFN>\" //    Represents the defining instance of a term\n");
      out.write("]\n");
      out.write("var colors = [\"BLUE\", \"RED\", \"GREEN\", \"YELLOW\", \"WHITE\", \"BLACK\", \"SILVER\", \"GRAY\" ];\n");
      out.write("var Else = true;\n");
      out.write("var questions = [colors, HTMLTags4, HTMLTags3, HTMLTags2, HTMLTags1, Hello, Goodbye, Greeting, Name, Actions, Questions];\n");
      out.write("\n");
      out.write("\n");
      out.write("var reactions=[BotHello, BotGoodbye,BotGreeting];\n");
      out.write("var BotHello = [\"HI\", \"HEY\", \"HOWDY\", \"HEYA\", \"HOLA\", \"HELLO\", \"SUP\", \"KONNICHIWA\", \"ALOHA\"]\n");
      out.write("var BotGoodbye = [\"BYE\", \"SEE YA\", \"CYA\", \"LATER\", \"ADIOS\", \"SAYONARA\", \"SEEYA\"]\n");
      out.write("var BotGreeting = [\"WHAT'S UP\", \"HOW'S IT GOING\", \"HOW ARE YOU\", \"NICE TO SEE YOU\", \"GOOD MORNING\", \"WELCOME\"]\n");
      out.write("var BotPleasant = [\"Thanks.\", \"Good job.\", \"Cool.\", \"I see.\", \"Anyway.\", \"right-o.\"]\n");
      out.write("\n");
      out.write("function answer(x) {\n");
      out.write("    var botOut = botChat.value;\n");
      out.write("    document.getElementsByTagName(\"textarea\")[0] = botChat\n");
      out.write("    //RESPONSES//\n");
      out.write("\n");
      out.write("                document.getElementsByTagName(\"input\")[0].value = \"\"\n");
      out.write("                if (x.charAt(0).includes(\"!\") === false){\n");
      out.write("                youSay(x); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                } \n");
      out.write("                question = x.toUpperCase()\n");
      out.write("                for (i = 0; i < 10; i++) {\n");
      out.write("            /*          EMPTY RESPONSE          */                    \n");
      out.write("                if (question === \"\" || null) {\n");
      out.write("                    setTimeout( function() { botSays(\"\\nBot : Let us know what we can help you with\"); botChat.scrollTop = botChat.scrollHeight;}, 600);\n");
      out.write("                return; }\n");
      out.write("                /*          COMMAND MENU RESPONSES         */                    \n");
      out.write("                else if (question === \"!MENU\" ) {\n");
      out.write("                botSays(\"\\n\\n**Commands are !Name yourName, !Bgcolor backgroundColor, !Text textColor, !Menu, !Secrets, !Tutorial, !Botsay textSays, and !Me textDoes,. Play around.\"); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                return;\n");
      out.write("                }else if (question.slice(0,9).includes(\"!BGCOLOR \") ) {\n");
      out.write("                    botSays(\"\\n\\n**Changed the background color to \" + x.slice(9) ); botChat.scrollTop = botChat.scrollHeight; botChat.style.backgroundColor = x.slice(9);\n");
      out.write("                return;\n");
      out.write("                } else if (question.slice(0,6).includes(\"!TEXT \") ) {\n");
      out.write("                    botSays(\"\\n\\n**Changed the text color to \" + x.slice(6) ); botChat.scrollTop = botChat.scrollHeight; botChat.style.color = x.slice(6);\n");
      out.write("                return;\n");
      out.write("                } else if (question.slice(0,6).includes(\"!NAME \") ) {\n");
      out.write("                    you = x.slice(6);\n");
      out.write("                    botSays(\"\\n\\n**Your name is \" + you); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                return;\n");
      out.write("                } else if (question.slice(0,9).includes(\"!SECRETS\") ) {\n");
      out.write("                    botSays(\"\\n\\n**What? I don't have any secrets. I've got nothing to hide.\"); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                return;\n");
      out.write("                }\n");
      out.write("                else if (question.slice(0,10).includes(\"!TUTORIAL\") ) {\n");
      out.write("                    botSays(\"\\n\\n**What? I don't have a tutorial. Read my code, I'm not going to explain myself.\"); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                return;\n");
      out.write("                }\n");
      out.write("                else if (question.slice(0,10).includes(\"!BOTSAY\") ) {\n");
      out.write("                    botSays(\"\\nBot : \" + x.slice(8)); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                return;\n");
      out.write("                } else if (question.slice(0,4).includes(\"!ME\") ) {\n");
      out.write("                    youDo(x.slice(4)); botChat.scrollTop = botChat.scrollHeight;\n");
      out.write("                return;\n");
      out.write("                }\n");
      out.write(" /* Questions, Answers and Responses */\n");
      out.write("                if (question.includes(Goodbye[i])) {\n");
      out.write("                    Else = false;\n");
      out.write("                    setTimeout(botSays, 600, \"\\\n");
      out.write("                                 Bot : Godspeed. Leave an upvote?\")\n");
      out.write("                } else if (question.includes(Name[i])) {\n");
      out.write("                    Else = false; setTimeout(botSays, 600, \"\\nBot : My name is BotOne. You can call me tonE.\")\n");
      out.write("                } else if ( question.includes(HTMLTags1[i]) ) {\n");
      out.write("                    /*HTML Tag Definitions Courtesy of W3Schools.com*/\n");
      out.write("                    Else = false; if (HTMLTags1[i] === \"<P>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<p>' Defines a paragraph.\") } else if (HTMLTags1[i] === \"<I>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<i>' Defines a part of text in an alternate voice or mood. Italics.\") } else if (HTMLTags1[i] === \"<SPAN>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<Span>' Defines a section in a document.\") } else if (HTMLTags1[i] === \"<A>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<Span>' Defines a section in a document.\") }\n");
      out.write("                } else if ( question.includes(HTMLTags2[i]) ) {\n");
      out.write("                    /*HTML Tag Definitions Courtesy of W3Schools.com*/\n");
      out.write("                    Else = false; if (HTMLTags2[i] === \"<ABBR>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<abbr>' Defines an abbreviation or acronym.\") } else if (HTMLTags2[i] === \"<ACRONYM>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<acronym>' Not supported in HTML5, use '<abbr>' instead.\") } else if (HTMLTags2[i] === \"<ADDRESS>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<address>' Defines contact information for the author/owner of a document.\") } else if (HTMLTags2[i] === \"<APPLET>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<applet>' Not supported in HTML5, use '<embed>' or '<object>' instead.\") }else if (HTMLTags2[i] === \"<AREA>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<area>' Defines an area inside an image map\") } else if (HTMLTags2[i] === \"<ARTICLE>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<article>' Defines an article.\") } else if (HTMLTags2[i] === \"<ASIDE>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<aside>' Defines content aside from the page content.\") }  else if (HTMLTags2[i] === \"<AUDIO>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<audio>' Defines sound content.\") } else if (HTMLTags2[i] === \"<B>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<B>' Defines bold text.\") }\n");
      out.write("                } else if ( question.includes(HTMLTags3[i]) ) {\n");
      out.write("                    Else = false;\n");
      out.write("                    if (HTMLTags3[i] === \"<BASE>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<base>' Specifies the base URL/target for all relative URLs in a document\") } else if (HTMLTags3[i] === \"<BASEFONT>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<basefont>' Not supported in HTML5. Use CSS instead.  Specifies a default color, size, and font for all text in a document. \") } else if (HTMLTags3[i] === \"<BDI>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<bdi>' Isolates a part of text that might be formatted in a different direction from other text outside it. \") } else if (HTMLTags3[i] === \"<BDO>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<bdo>' Overrides the current text direction. \") } else if (HTMLTags3[i] === \"<BIG>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<big>' Not supported in HTML5, use CSS instead. Defines big text. \") } else if (HTMLTags3[i] === \"<BLOCKQUOTE>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<blockquote>' Defines a section that is quoted from another source. \") } else if (HTMLTags3[i] === \"<BODY>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<body>' Defines a document's body. \") } else if (HTMLTags3[i] === \"<BR>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<br>' Defines a single line break. \") } else if (HTMLTags3[i] === \"<BUTTON>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<button>' Defines a clickable button. \") } else if (HTMLTags3[i] === \"<CANVAS>\" ) { setTimeout(botSays, 600, \"\\nBot : The HTML tag '<canvas>' Used to draw graphics, on the fly, via scripting. Usually Javascript. \") }         \n");
      out.write("                    \n");
      out.write("                /*} else if ( question.includes(HTMLTags4[i]) ) {\n");
      out.write("\n");
      out.write("                } else if ( question.includes(HTMLTags5[i]) ) {\n");
      out.write("                    \n");
      out.write("                } else if ( question.includes(HTMLTags6[i]) ) {    */\n");
      out.write("                /*} else if ( question.includes(HTMLTags7[i]) ) {\n");
      out.write("\n");
      out.write("                } else if ( question.includes(HTMLTags8[i]) ) {\n");
      out.write("                    \n");
      out.write("                } else if ( question.includes(HTMLTags9[i]) ) {    */\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }else if (question.includes(Actions[i])) {\n");
      out.write("                    Else = false; if (question.includes(\"CHALLENGE\")) { setTimeout(botSays, 600, \"\\nBot : Challenge my creator. Go for it.\") } else { setTimeout(botSays, 600, \"\\nBot : How can I help?  Use my commands !Menu & !Tutorial to see what I can do.\") }\n");
      out.write("                } else if (question.includes(Questions[i])) {\n");
      out.write("                    Else = false; if (Questions[i].includes(\"HTML\")) { setTimeout(botSays, 600, \"\\nBot : Ask my creator. Go for it. Post your question in the comments, he'll try to help you. I'm just a code, I don't know HOW to code.\") } else { setTimeout(botSays, 600, \"\\nBot : How can I help? Use my commands !Menu & !Tutorial to see what I can do.\") }\n");
      out.write("                } else if ( question.includes(Greeting[i]) ) {\n");
      out.write("                    Else = false; if (Greeting[i].includes(\"HOW\")&&Greeting[i].includes(\"YOU\")) {\n");
      out.write("                    var reactHello = \"How am I\";\n");
      out.write("                    var reactGreeting = \"I would say I am 40% complete.\" }\n");
      out.write("                    else {\n");
      out.write("                   num = Math.ceil(Math.random()*3)\n");
      out.write("                    var reactHello = Greeting[num]\n");
      out.write("                    reactHello = reactHello.toLowerCase();\n");
      out.write("                    reactHello = reactHello.charAt(0).toUpperCase() + reactHello.slice(1);\n");
      out.write("                    var reactGreeting = \"Same old. Getting coded mostly.\";\n");
      out.write("                    }\n");
      out.write("                    var reactPleasant = BotPleasant[num]\n");
      out.write("                    setTimeout(botSays, 600, \"\\nBot : \" + reactHello + \". \" + reactGreeting + \" \" + reactPleasant )\n");
      out.write("                  } else if (question.includes(Hello[i])) {\n");
      out.write("                  var reactHello = Hello[i];\n");
      out.write("                  reactHello = reactHello.toLowerCase();\n");
      out.write("                  reactHello = reactHello.charAt(0).toUpperCase() + reactHello.slice(1);\n");
      out.write("                  var reactGreeting = \"\";\n");
      out.write("                  var reactPleasant = \"\"\n");
      out.write("                    Else = false;\n");
      out.write("                      setTimeout(botSays, 600, \"\\nBot : \" + reactHello + \".\")\n");
      out.write("                } else { } }  setTimeout( function() { if (Else === true) {botSays(\"\\n\\n**Error 404: Response Not Found.\"); } } , 700);  setTimeout( function() {Else = true; botChat.scrollTop = botChat.scrollHeight;}, 730)\n");
      out.write("            } function botSays(x) {\n");
      out.write("                document.getElementsByTagName(\"textarea\")[0].innerHTML += x;\n");
      out.write("            } function youSay(x) { botSays(\"\\n\"+ you + \" \\ : \" + x)\n");
      out.write("            }\n");
      out.write("            function youDo(x) { botSays(\"\\n\"+ you + \" \" + x)                                            \n");
      out.write("            } function enterButton(e, x) { if (e.keyCode == 13) { answer(x); }   }    \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
