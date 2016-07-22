package assembla

class mainController {

    def index() { }

    def submit() {

        String url = "https://app.assembla.com/spaces/markable/tickets/" + params.number
        redirect(url: url )

    }


}
