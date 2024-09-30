import { Link } from "react-router-dom"

const Header = () => {

    return(
        <>
            <Link to="/">홈</Link>
            <Link to="/info">정보</Link>       
        </>
    )
}

export default Header
