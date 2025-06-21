@RestController
public class ThingController {

    @GetMapping("/things"){
        public list<Thing> getAllThings(){
            return service.gettAll();
        }
    }

}