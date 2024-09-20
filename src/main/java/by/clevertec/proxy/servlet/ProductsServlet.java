package by.clevertec.proxy.servlet;

import by.clevertec.proxy.util.helper.ProductHelper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class ProductsServlet extends HttpServlet {

    private final ProductHelper productHelper;

    @Override
    @GetMapping("/products")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        productHelper.setProductsGetResponse(req, resp);
    }
}
