.class final Lcom/google/android/gms/games/internal/d$ed;
.super Lcom/google/android/gms/games/internal/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ed"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/h;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/g;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ail;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/h;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->a:Lcom/google/android/gms/internal/ail;

    iput-object v1, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    iput-object v1, p0, Lcom/google/android/gms/games/internal/d$ed;->c:Lcom/google/android/gms/internal/ail;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/h;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<+",
            "Lcom/google/android/gms/games/multiplayer/realtime/g;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/games/multiplayer/realtime/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/a;-><init>()V

    const-string v0, "Callbacks must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->a:Lcom/google/android/gms/internal/ail;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    iput-object p3, p0, Lcom/google/android/gms/games/internal/d$ed;->c:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$dc;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$dc;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->c:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->c:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$cu;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$cu;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$dd;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$dd;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$de;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$de;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$bt;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$bt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$da;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$da;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$cx;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$cx;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public e(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$cz;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$cz;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$cy;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$cy;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public f(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$db;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/games/internal/d$db;-><init>(Lcom/google/android/gms/common/data/DataHolder;[Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public s(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$eg;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$eg;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public t(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$bo;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$bo;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public u(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$ef;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$ef;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public v(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$ec;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$ec;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public w(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$ee;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$ee;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public x(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$ah;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$ah;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method

.method public y(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ed;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/games/internal/d$an;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/d$an;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    :cond_0
    return-void
.end method
