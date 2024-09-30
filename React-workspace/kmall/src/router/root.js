import { createBrowserRouter } from "react-router-dom";
import MainPage from "../pages/MainPage";

const root = createBrowserRouter([
    {
        path: '',
        element: <MainPage />
    }
])

export default root 