.class public Lcom/google/android/gms/internal/gm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/auth/w;


# instance fields
.field private a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "userId"
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "providerId"
    .end annotation
.end field

.field private c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "displayName"
    .end annotation
.end field

.field private d:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "photoUrl"
    .end annotation
.end field

.field private e:Landroid/net/Uri;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/gc;
    .end annotation
.end field

.field private f:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "email"
    .end annotation
.end field

.field private g:Z
    .annotation runtime Lcom/google/android/gms/internal/om;
        a = "isEmailVerified"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/api/model/GetAccountInfoUser;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/google/firebase/auth/api/model/GetAccountInfoUser;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/gm;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->f()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/gm;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->e:Landroid/net/Uri;

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/GetAccountInfoUser;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gm;->g:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/api/model/ProviderUserInfo;)V
    .locals 2
    .param p1    # Lcom/google/firebase/auth/api/model/ProviderUserInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/api/model/ProviderUserInfo;->d()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/gm;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->e:Landroid/net/Uri;

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gm;->g:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/w;)V
    .locals 1
    .param p1    # Lcom/google/firebase/auth/w;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->a:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->b:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->c:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->d()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->d()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->e:Landroid/net/Uri;

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->d:Ljava/lang/String;

    :cond_0
    invoke-interface {p1}, Lcom/google/firebase/auth/w;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->f:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/firebase/auth/w;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gm;->g:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->e:Landroid/net/Uri;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gm;->e:Landroid/net/Uri;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->e:Landroid/net/Uri;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gm;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gm;->g:Z

    return v0
.end method
