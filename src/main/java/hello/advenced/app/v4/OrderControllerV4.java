package hello.advenced.app.v4;

import hello.advenced.trace.TraceStatus;
import hello.advenced.trace.logtrace.LogTrace;
import hello.advenced.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV4 {

    private final OrderServiceV4 orderService;
    private final LogTrace trace;

    @GetMapping("/v4/request")
    public String request(String itemId){

        AbstractTemplate<String> template = new AbstractTemplate<String>(trace) {
            //템플릿 메서드 패턴은 상속을 사용한다.
            //따라서 상속의 단점을 그대로 안고간다. 구조적으로도 별도의 클래스나 익명 내부 클래스를 만들어야 한다.
            //상속 단점을 제거할 수 있는 전략 패턴을 사용할 수 있다.
            @Override
            protected String call() {
                orderService.orderItem(itemId);
                return "ok";
            }
        };
        return template.execute("OrderController.request");
    }
}
