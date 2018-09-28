class Layout extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {

        return (
       <div className="layout">
            <Header/>
            <div className="content">
                <Main/>
                <Aside/>
            </div>
       </div>
    );
    }
}