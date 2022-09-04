.class Lcom/google/android/gms/tagmanager/dt;
.super Lcom/google/android/gms/tagmanager/t;


# static fields
.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final d:Lcom/google/android/gms/tagmanager/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/eg;->i:Lcom/google/android/gms/internal/eg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eg;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/dt;->a:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/fh;->bQ:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/dt;->b:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/fh;->av:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/dt;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/tagmanager/e;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/tagmanager/dt;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/tagmanager/dt;->b:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/t;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dt;->d:Lcom/google/android/gms/tagmanager/e;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lcom/google/android/gms/internal/hj$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;)",
            "Lcom/google/android/gms/internal/hj$a;"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dt;->d:Lcom/google/android/gms/tagmanager/e;

    sget-object v0, Lcom/google/android/gms/tagmanager/dt;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->a(Lcom/google/android/gms/internal/hj$a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tagmanager/e;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/tagmanager/dt;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/tagmanager/cw;->g()Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/tagmanager/cw;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/hj$a;

    move-result-object v0

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
