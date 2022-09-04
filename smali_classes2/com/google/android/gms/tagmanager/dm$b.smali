.class Lcom/google/android/gms/tagmanager/dm$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/av;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/dm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/av",
        "<",
        "Lcom/google/android/gms/internal/el$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/dm;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/dm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm$b;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/tagmanager/dm$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/dm$b;-><init>(Lcom/google/android/gms/tagmanager/dm;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/el$a;)V
    .locals 5

    iget-object v0, p1, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm$b;->a:Lcom/google/android/gms/tagmanager/dm;

    iget-wide v2, p1, Lcom/google/android/gms/internal/el$a;->a:J

    const/4 v4, 0x1

    invoke-static {v1, v0, v2, v3, v4}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/internal/gi$j;JZ)V

    return-void

    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    new-instance v0, Lcom/google/android/gms/internal/gi$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gi$j;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/gi$j;->b:Lcom/google/android/gms/internal/gi$f;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/google/android/gms/internal/gi$j;->a:[Lcom/google/android/gms/internal/gi$i;

    iget-object v1, v1, Lcom/google/android/gms/internal/gi$f;->l:Ljava/lang/String;

    iput-object v1, v0, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/tagmanager/av$a;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$b;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->e(Lcom/google/android/gms/tagmanager/dm;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$b;->a:Lcom/google/android/gms/tagmanager/dm;

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;J)V

    :cond_0
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/el$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/dm$b;->a(Lcom/google/android/gms/internal/el$a;)V

    return-void
.end method
