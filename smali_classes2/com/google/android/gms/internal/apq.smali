.class public Lcom/google/android/gms/internal/apq;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/tagmanager/aj;

.field private final d:Lcom/google/android/gms/tagmanager/af;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/apq;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/apq;->c:Lcom/google/android/gms/tagmanager/aj;

    iput-object p3, p0, Lcom/google/android/gms/internal/apq;->d:Lcom/google/android/gms/tagmanager/af;

    iput-object p4, p0, Lcom/google/android/gms/internal/apq;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/dy;)Lcom/google/android/gms/internal/app;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/app;

    iget-object v1, p0, Lcom/google/android/gms/internal/apq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/apq;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/apq;->c:Lcom/google/android/gms/tagmanager/aj;

    iget-object v6, p0, Lcom/google/android/gms/internal/apq;->d:Lcom/google/android/gms/tagmanager/af;

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/app;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/dy;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/tagmanager/af;)V

    return-object v0
.end method
