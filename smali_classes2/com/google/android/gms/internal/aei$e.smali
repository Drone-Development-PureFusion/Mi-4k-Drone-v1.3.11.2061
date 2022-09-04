.class final Lcom/google/android/gms/internal/aei$e;
.super Lcom/google/android/gms/internal/aei$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/aei$b",
        "<",
        "Lcom/google/android/gms/appinvite/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aei;

.field private final b:Landroid/app/Activity;

.field private final c:Z

.field private final d:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aei;Lcom/google/android/gms/common/api/g;Landroid/app/Activity;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/aei$e;->a:Lcom/google/android/gms/internal/aei;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aei$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/aei$e;->b:Landroid/app/Activity;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/aei$e;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e;->b:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/aei$e;->d:Landroid/content/Intent;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aei$e;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aei$e;->c:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aei$e;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e;->b:Landroid/app/Activity;

    return-object v0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appinvite/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aek;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/aek;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aej;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aei$e;->a(Lcom/google/android/gms/internal/aej;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aej;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e;->d:Landroid/content/Intent;

    invoke-static {v0}, Lcom/google/android/gms/appinvite/e;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/aek;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    iget-object v2, p0, Lcom/google/android/gms/internal/aei$e;->d:Landroid/content/Intent;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/aek;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aei$e;->b(Lcom/google/android/gms/common/api/m;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/aej;->a(Lcom/google/android/gms/internal/ael;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/aei$e$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aei$e$1;-><init>(Lcom/google/android/gms/internal/aei$e;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/aej;->a(Lcom/google/android/gms/internal/ael;)V

    goto :goto_0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aei$e;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appinvite/d;

    move-result-object v0

    return-object v0
.end method
