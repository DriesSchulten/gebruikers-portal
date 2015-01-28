package portal.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import portal.model.Index

/**
 * Root controller
 */
@RestController
@RequestMapping("/api")
class RootController {

    @RequestMapping("/")
    def index() {
        new Index(title: "index")
    }
}
