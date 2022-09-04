.class public Lcom/google/android/gms/internal/afd;
.super Lcom/google/android/gms/cast/framework/m;


# instance fields
.field private final a:Lcom/google/android/gms/cast/framework/CastOptions;

.field private final b:Lcom/google/android/gms/internal/afm;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/internal/afm;)V
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/internal/afd;->a(Lcom/google/android/gms/cast/framework/CastOptions;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/m;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/afd;->a:Lcom/google/android/gms/cast/framework/CastOptions;

    iput-object p3, p0, Lcom/google/android/gms/internal/afd;->b:Lcom/google/android/gms/internal/afm;

    return-void
.end method

.method private static a(Lcom/google/android/gms/cast/framework/CastOptions;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/CastOptions;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/CastOptions;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/cast/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/CastOptions;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/CastOptions;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/b;->a(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/j;
    .locals 10

    new-instance v0, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afd;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afd;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/google/android/gms/internal/afd;->a:Lcom/google/android/gms/cast/framework/CastOptions;

    sget-object v5, Lcom/google/android/gms/cast/a;->l:Lcom/google/android/gms/cast/a$b;

    new-instance v6, Lcom/google/android/gms/internal/afe;

    invoke-direct {v6}, Lcom/google/android/gms/internal/afe;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/afq;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afd;->a()Landroid/content/Context;

    move-result-object v3

    iget-object v8, p0, Lcom/google/android/gms/internal/afd;->a:Lcom/google/android/gms/cast/framework/CastOptions;

    iget-object v9, p0, Lcom/google/android/gms/internal/afd;->b:Lcom/google/android/gms/internal/afm;

    invoke-direct {v7, v3, v8, v9}, Lcom/google/android/gms/internal/afq;-><init>(Landroid/content/Context;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/internal/afm;)V

    move-object v3, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/cast/framework/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/cast/a$b;Lcom/google/android/gms/internal/afe;Lcom/google/android/gms/internal/afq;)V

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afd;->a:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->f()Z

    move-result v0

    return v0
.end method
