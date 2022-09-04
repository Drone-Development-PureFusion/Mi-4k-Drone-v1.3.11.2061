.class public Lcom/google/firebase/appindexing/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/appindexing/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/appindexing/a$a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "ActivateAction"

.field public static final b:Ljava/lang/String; = "AddAction"

.field public static final c:Ljava/lang/String; = "BookmarkAction"

.field public static final d:Ljava/lang/String; = "CommentAction"

.field public static final e:Ljava/lang/String; = "LikeAction"

.field public static final f:Ljava/lang/String; = "ListenAction"

.field public static final g:Ljava/lang/String; = "SendAction"

.field public static final h:Ljava/lang/String; = "ShareAction"

.field public static final i:Ljava/lang/String; = "ViewAction"

.field public static final j:Ljava/lang/String; = "WatchAction"

.field public static final k:Ljava/lang/String; = "http://schema.org/ActiveActionStatus"

.field public static final l:Ljava/lang/String; = "http://schema.org/CompletedActionStatus"

.field public static final m:Ljava/lang/String; = "http://schema.org/FailedActionStatus"


# instance fields
.field private final n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

.field private s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/firebase/appindexing/a$b;->a:Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

    iput-object v0, p0, Lcom/google/firebase/appindexing/a$a;->r:Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

    iput-object p1, p0, Lcom/google/firebase/appindexing/a$a;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/appindexing/a$b$a;)Lcom/google/firebase/appindexing/a$a;
    .locals 1
    .param p1    # Lcom/google/firebase/appindexing/a$b$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/firebase/appindexing/a$b$a;->a()Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/appindexing/a$a;->r:Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/firebase/appindexing/a$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/google/firebase/appindexing/a$a$a;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/appindexing/a$a;->s:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appindexing/a$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/firebase/appindexing/internal/k;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/appindexing/a$a;->o:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/appindexing/a$a;->p:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appindexing/a$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/firebase/appindexing/internal/k;->a(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/google/firebase/appindexing/internal/k;->b(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/appindexing/a$a;->o:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/appindexing/a$a;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/appindexing/a$a;->q:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/firebase/appindexing/a;
    .locals 7

    iget-object v0, p0, Lcom/google/firebase/appindexing/a$a;->o:Ljava/lang/String;

    const-string v1, "setObject is required before calling build()."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/appindexing/a$a;->p:Ljava/lang/String;

    const-string v1, "setObject is required before calling build()."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/firebase/appindexing/internal/ActionImpl;

    iget-object v1, p0, Lcom/google/firebase/appindexing/a$a;->n:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/appindexing/a$a;->o:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/appindexing/a$a;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/appindexing/a$a;->q:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/firebase/appindexing/a$a;->r:Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;

    iget-object v6, p0, Lcom/google/firebase/appindexing/a$a;->s:Ljava/lang/String;

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/appindexing/internal/ActionImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/appindexing/internal/ActionImpl$MetadataImpl;Ljava/lang/String;)V

    return-object v0
.end method
