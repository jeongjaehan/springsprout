package springsprout.modules.study.post.imagePost;

import springsprout.common.dao.GenericDao;
import springsprout.domain.study.board.ImagePost;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: whiteship
 * Date: 2010. 10. 14
 * Time: 오후 2:49:37
 */
public interface ImagePostRepository extends GenericDao<ImagePost> {
	List<ImagePost> getRootPostList(int start, int limit, int studyId);
}
