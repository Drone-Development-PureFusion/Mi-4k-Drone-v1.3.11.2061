.class public Lcom/google/android/gms/internal/fy;
.super Ljava/lang/Object;


# direct methods
.method public static a()Lcom/google/android/gms/internal/nr;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/fx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fx;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/gg;

    invoke-direct {v1}, Lcom/google/android/gms/internal/gg;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/gf;

    invoke-direct {v2}, Lcom/google/android/gms/internal/gf;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ns;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ns;-><init>()V

    const/4 v4, 0x3

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ns;->a([I)Lcom/google/android/gms/internal/ns;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ns;->a()Lcom/google/android/gms/internal/ns;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/google/android/gms/internal/nm;

    const/4 v5, 0x0

    new-instance v6, Lcom/google/android/gms/internal/fs;

    invoke-direct {v6}, Lcom/google/android/gms/internal/fs;-><init>()V

    aput-object v6, v4, v5

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ns;->a([Lcom/google/android/gms/internal/nm;)Lcom/google/android/gms/internal/ns;

    move-result-object v3

    const-class v4, Lcom/google/firebase/auth/api/model/GetAccountInfoUserList;

    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/internal/ns;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/ns;

    move-result-object v3

    const-class v4, Lcom/google/firebase/auth/api/model/StringList;

    invoke-virtual {v3, v4, v1}, Lcom/google/android/gms/internal/ns;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/ns;

    move-result-object v3

    const-class v4, Lcom/google/firebase/auth/api/model/ProviderUserInfoList;

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/ns;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/android/gms/internal/ns;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ns;->b()Lcom/google/android/gms/internal/nr;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/fx;->a(Lcom/google/android/gms/internal/nr;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/gg;->a(Lcom/google/android/gms/internal/nr;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/gf;->a(Lcom/google/android/gms/internal/nr;)V

    return-object v3

    nop

    :array_0
    .array-data 4
        0x8
        0x80
        0x40
    .end array-data
.end method
