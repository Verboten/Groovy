class HTMLGenerator{
    
    static void main(String[] args){
        generate_html_with_markupbuilder();
    }
    
    void generate_html_with_markupbuilder() {

        def writer = new StringWriter()
        def html = new MarkupBuilder(writer)
        html.html {
            head {
                title: "Creating html document with groovy"
                script: "alert('hello');"
            }
            body(id: "main") {
                h2 id: "book-mark",  "Generating html with groovy"
                p {
                    mkp.yield "Mixing text with"
                    strong "strong"
                    mkp.yield " elements."
                }
                a href: "www.google.com", "Google"
            }
        }
        println writer
    }
}
