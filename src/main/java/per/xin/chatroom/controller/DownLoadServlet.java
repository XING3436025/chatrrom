package per.xin.chatroom.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import per.xin.chatroom.service.impl.DownloadFileSV;


/**'
 * 下载文件
 * @author
 *
 */
@WebServlet(name = "download", urlPatterns = { "/download" })
public class DownLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private DownloadFileSV downloadFile;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownLoadServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

		downloadFile.downloadFile(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
